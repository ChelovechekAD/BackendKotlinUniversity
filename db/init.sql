INSERT INTO public.day_of_week(id, day)
VALUES (1, 'MONDAY');
INSERT INTO public.day_of_week(id, day)
VALUES (2, 'THURSDAY');
INSERT INTO public.day_of_week(id, day)
VALUES (3, 'WEDNESDAY');
INSERT INTO public.day_of_week(id, day)
VALUES (4, 'THUESDAY');
INSERT INTO public.day_of_week(id, day)
VALUES (5, 'FRIDAY');
INSERT INTO public.day_of_week(id, day)
VALUES (6, 'SATURDAY');
INSERT INTO public.day_of_week(id, day)
VALUES (7, 'SUNDAY');

INSERT INTO public.subject(id, subject_name)
VALUES (1, 'Java');
INSERT INTO public.subject(id, subject_name)
VALUES (2, 'Python');
INSERT INTO public.subject(id, subject_name)
VALUES (3, 'C#');
INSERT INTO public.subject(id, subject_name)
VALUES (4, 'C++');


INSERT INTO public.course(id, description, title, subject_id)
VALUES (1, 'Вы тут это короче кодить научитесь.', 'Разработка энтерпрайз решений на Java', 1,
        "https://www.orbitcybermatics.com/assets/img/javaimg.jpg");
INSERT INTO public.course(id, description, title, subject_id)
VALUES (2, 'Вы тут это короче кодить научитесь.', 'Программирование на Java', 1,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-VYftrBNDZDUw0UU1_laEDpKxiIatZXJR0Q&s");
INSERT INTO public.course(id, description, title, subject_id)
VALUES (3, 'Вы тут это короче кодить научитесь.', 'Программирование на Python', 2,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0F5w64_BnyNLBAT-BV_hjBBIAIKkPp-tq7A&s");
INSERT INTO public.course(id, description, title, subject_id)
VALUES (4, 'Вы тут это короче кодить научитесь.', 'Программирование на C++', 3);

INSERT INTO public.course_group(id, end_time, start_time, course_id)
VALUES (1, '20:20:00', '19:00:00', 1);
INSERT INTO public.course_group(id, end_time, start_time, course_id)
VALUES (2, '20:40:00', '18:00:00', 1);
INSERT INTO public.course_group(id, end_time, start_time, course_id)
VALUES (3, '20:40:00', '18:00:00', 1);
INSERT INTO public.course_group(id, end_time, start_time, course_id)
VALUES (4, '20:40:00', '18:00:00', 2);
INSERT INTO public.course_group(id, end_time, start_time, course_id)
VALUES (5, '20:40:00', '18:00:00', 2);
INSERT INTO public.course_group(id, end_time, start_time, course_id)
VALUES (6, '20:40:00', '18:00:00', 3);
INSERT INTO public.course_group(id, end_time, start_time, course_id)
VALUES (7, '20:40:00', '18:00:00', 4);

INSERT INTO public.courses_additional_info_day_of_week(courses_additional_info_id, day_of_week_id)
VALUES (1, 1);
INSERT INTO public.courses_additional_info_day_of_week(courses_additional_info_id, day_of_week_id)
VALUES (2, 2);
INSERT INTO public.courses_additional_info_day_of_week(courses_additional_info_id, day_of_week_id)
VALUES (3, 3);
INSERT INTO public.courses_additional_info_day_of_week(courses_additional_info_id, day_of_week_id)
VALUES (4, 4);
INSERT INTO public.courses_additional_info_day_of_week(courses_additional_info_id, day_of_week_id)
VALUES (5, 5);
INSERT INTO public.courses_additional_info_day_of_week(courses_additional_info_id, day_of_week_id)
VALUES (6, 6);
INSERT INTO public.courses_additional_info_day_of_week(courses_additional_info_id, day_of_week_id)
VALUES (7, 7);
