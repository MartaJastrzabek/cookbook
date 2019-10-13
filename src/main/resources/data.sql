INSERT INTO category (name, description, img) VALUES ('MEATS', 'Przepisy na dania mięsne. Idealne na obiad.', 'meat.jpg'),
                                                      ('PASTAS', 'Przepisy na dania z makaronu. Idealne na szybki obiad.', 'pasta.jpg'),
                                                      ('SALADS', 'Przepisy na sałatki. Idealne na lekki obiad, przystawkę czy przyjęcie.', 'salad.jpg'),
                                                      ('MEAT_FREE', 'Przepisy na dania bez mięsne. Idealne na zdrowy obiad.', 'meat_free.jpg'),
                                                      ('DESSERTS', 'Przepisy na dania mięsne. Idealne na obiad.', 'dessert.jpg'),
                                                      ('SOUPS', 'Przepisy na zupy. Idealne na przystawkę, lekki obiad i kolacje.', 'soup.jpg');

INSERT INTO recipe (id, name, category_id, preparation) VALUES (1, 'Spaghetti bolonese', 2, 'Cebulę i czosnek obrać i poszatkować.
Marchewkę umyć, obrać i pokroić w drobną kostkę.Cebulę i czosnek chwilkę podsmażyć na oleju.
Dodać mięso mielone. Kolejno dodać marchewkę. Wszystko razem chwilę smażyć.
Dodać pomidory w puszcze (razem z sosem z puszki), przecier pomidorowy i wywar.
Całość dusić pod przykryciem na małym ogniu ok. 20 minut. Przyprawić solą, pieprzem i oregano.
Spaghetti ugotować według przepisu na opakowaniu. Odcedzić na durszlaku. (Nie przelewać zimną wodą).
Spaghetti rozłożyć na talerzach. Polać sosem z mięsem i posypać parmezanem.');

INSERT INTO ingredient(quantity, unit, name, recipe_id) VALUES (300, 'GRAM', 'mielona wołowina', 1),
                                                            (300, 'GRAM', 'makaron spagetthi', 1),
                                                            (1, 'PIECE', 'cebula', 1),
                                                            (1, 'PIECE', 'marchew', 1),
                                                            (1, 'PIECE', 'pomidory w puszce', 1);
INSERT INTO ingredient(name, recipe_id) VALUES ('sól', 1),
                                            ('pieprz', 1),
                                            ('oregano', 1),
                                            ('parmezan', 1);

