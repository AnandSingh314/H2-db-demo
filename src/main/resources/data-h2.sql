insert into author(id, first_name, last_name) values(1, 'Anand', 'Singh');
insert into post(id, title, body, author_id, posted_on) values(1, 'Spring Boot is awesome', 'Blog post body content....!!', 1, CURRENT_DATE());
insert into post(id, title, body, author_id, posted_on) values(2, 'Spring data rocks.', 'Blog post body content....!!', 1, CURRENT_DATE());