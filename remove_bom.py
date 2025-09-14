import os

def remove_bom(file_path):
    with open(file_path, 'rb') as f:
        content = f.read()
    if content.startswith(b'\xef\xbb\xbf'):
        content = content[3:]
    with open(file_path, 'wb') as f:
        f.write(content)

def process_directory(directory):
    for root, dirs, files in os.walk(directory):
        for file in files:
            if file.endswith('.java'):
                file_path = os.path.join(root, file)
                remove_bom(file_path)

# Укажите путь к директориям с исходными файлами
src_dir = 'C:/Users/ilyav/Desktop/Labs/Тестирование ПО/Лабораторная_работа_2/src/main/java'
test_dir = 'C:/Users/ilyav/Desktop/Labs/Тестирование ПО/Лабораторная_работа_2/src/test/java'

process_directory(src_dir)
process_directory(test_dir)
