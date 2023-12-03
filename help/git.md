# Система контроля версия Git


## Основные разделы
1. [Установка и настройка](#install)
2. [Основы git](#base)


### Подробности разделов 
#### 1. Установка и настройка <a name="install"></a>

1. Linux
   + Fedora
        + yum install git   
   + Debian (Ubunta)
        + apt-get install git
   + Manjaro
        + sudo pacman -S git
2. Windows
    + Установка GitHub для Windows
        + http://windows.github.com
    + Git для windows
        + http://git-scm.com/download/win
3. Mac
   + https://git-scm.com/download/mac
#### 2. Основы git <a name="base"></a>

1. Иницализация репозитория в существующей папке
   + git init
2. Клонирование существующего репозитория
    + git clone [url]
3. Проверка состояния файлов
    + git status
4. Слежение за новыми файлами
    + git add [file_name]
5. Краткий отчет о состоянии
    + git status -s (или --short)
6. Игнорирование файлов
    + изменение файла .gitignore
7. Просмотр неиндексированных изменений
    + git diff
8. Просмотр индексированных изменений
    + git diff --staged
9. Фиксация изменений 
    + git commit 
    + git commit -m "Comments for commit"
10. Пропуск области индексирования
    + git add -a -m "Comments for commit"
11. Удаление файлов (из папки и из git)
    + git rm [fileName]
    + Если файл был уже проиндексирован
        + git rm -f [fileName]
    + Удаление из git, но оставление в папке
        + git rm --cached [fileName]
12. Перемещение файлов (Переименование)
    + git mv [fileOldName] [fileNewName]
    + Эквивалентная запись
        + git mv [fileOldName] [fileNewName]
        + git rm [fileOldName]
        + git add [fileNewName]
13. Просмотр истории версий
    > Выводит в обратном хронологическом порядке список сохраненных  в данный репозиторий версий.
    + git log
    > Выводит разницу, внесенную каждым коммитом.
    Для последних двух записей
    + git log -p -2
    > Краткая статистика для каждой версии
    + git log --stat
14. TO DO
    + git log pretty
15. Отмена изменений
    > Если после фиксации очередной версии вы обнаружили , что забыли проиндексировать изменения 
    > в одном из файлов, который планировалось включить в новый коммит, можно сделать так:
    + git commit -m "first commit"
    + git add forgotten_file
    + git commit --amend
16. Отмена индексирования
    + git reset HEAD [fileName]
17. Отмена, внесенных в файл изменений
    + git checkout -- [fileName]
18. Отображение удаленных репозиториев
    > Источник, то есть имя, которое Git по умолчанию присваивает клонируемому серверу
    +  git remote 
    > Позволяет увидеть URL-адреса, которые Git хранит для сокращенного имени, используемого при чтении из данного удаленного репозитория и при записи в него
    +  git remote -v
19. Добавление удалленых репозиториев
    + git remote add [shortName] [url]
      + Теперь можно обращаться по краткому имени!
20. Извлечение данных из удаленных репозиториев
    > Извлечение данных из репозитория, которые отсутствуют в локальном репозитории
    + git fetch [repositoryName]
21. Отправка данных в удаленный репозиторий
    > Название сервера-origin происходит по умолчанию!
    + git push [имя удаленного сервера] [ветка]
22. Просмотр удаленных репозиториев
    + git remote show origin
23. Переименование удаленных репозиториев
    + git remote rename [oldName] [newName]
23. Удаление удаленных репозиториев
    + git remote rm [localName]