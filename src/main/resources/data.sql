INSERT INTO category (name, description, img) VALUES ('MEATS', 'Przepisy na dania mięsne. Idealne na obiad.', '/meat.jpg'),
                                                      ('PASTAS', 'Przepisy na dania z makaronu. Idealne na szybki obiad.', '/pasta.jpg'),
                                                      ('SALADS', 'Przepisy na sałatki. Idealne na lekki obiad, przystawkę czy przyjęcie.', '/salad.jpg'),
                                                      ('MEAT_FREE', 'Przepisy na dania bez mięsne. Idealne na zdrowy obiad.', '/meat_free.jpg'),
                                                      ('DESSERTS', 'Przepisy na dania mięsne. Idealne na obiad.', '/dessert.jpg'),
                                                      ('SOUPS', 'Przepisy na zupy. Idealne na przystawkę, lekki obiad i kolacje.', '/soup.jpg');

INSERT INTO recipe (id, name, category_id, preparation) VALUES (1, 'Spaghetti bolognese', 2, 'Cebulę i czosnek obrać i poszatkować.
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
INSERT INTO recipe (id, name, category_id, preparation) VALUES (2, 'Zielona sałatka', 3, 'Pestki dyni uprażyłam na suchej patelni i wystudziłam.
Oliwki pokroiłam w plasterki. Na talerze wyłożyłam porcje rukoli, posypałam plasterkami oliwek, uprażonymi pestkami dyni,
skropiłam sokiem z cytryny, dodałam wiórki parmezanu, doprawiłam solą i pieprzem i polałam olejem');

INSERT INTO ingredient(quantity, unit, name, recipe_id) VALUES (100, 'GRAM', 'rukola', 2),
                                                               (3, 'SPOON', 'zielone oliwki', 2),
                                                               (5, 'SPOON', 'oliwa', 2),
                                                               (0.5, 'PIECE', 'sok z cytryny', 2),
                                                               (3, 'SPOON', 'pestki z dyni', 2);
INSERT INTO ingredient(name, recipe_id) VALUES ('sól', 2),
                                               ('pieprz', 2),
                                               ('parmezan', 2);

INSERT INTO recipe (id, name, category_id, preparation) VALUES (3, 'Sałatka z gruszką', 3, 'Ziemniaki umyć, obrać i zetrzeć na tarce o grubych oczkach. Ze startych ziemniaków odcisnąć powstały płyn, a następnie dodać startą na tarce o drobnych oczkach cebulę, przeciśnięty przez praskę czosnek, posiekany koperek, olej z ryżu o smaku chili SoRiso, jajka, przyprawy (sól, pieprz, majeranek) i wszystko dokładnie wymieszać.
Dużą blachę do pieczenia wyłożyć papierem do pieczenia (papier można lekko natłuścić olejem z ryżu) i łyżką wykładać porcje masy ziemniaczanej formując placki.
Blachę z plackami wstawić do piekarnika nagrzanego do 200 stopni (grzanie góra i dół) i piec 25 minut, następnie wyjąć blachę z piekarnika, obrócić placki na drugą stronę i wstawić ponownie do piekarnika na 10-15 minut.');

INSERT INTO ingredient(quantity, unit, name, recipe_id) VALUES (100, 'GRAM', 'wędzony boczek', 3),
                                                                (100, 'GRAM', 'ser pleśniowy', 3),
                                                                (2, 'PIECE', 'gruszka', 3),
                                                                (1, 'SPOON', 'oliwa', 3),
                                                                (1, 'SPOON', 'musztarda', 3),
                                                                (1, 'SPOON', 'miód', 3),
                                                                (1, 'SPOON', 'sok z cytryny', 3),
                                                                (1, 'SPOON', 'pestki z Słonecznika', 3);
INSERT INTO ingredient(name, recipe_id) VALUES ('sól', 3),
                                               ('pieprz', 3),
                                               ('roszponka', 3);

INSERT INTO recipe (id, name, category_id, preparation) VALUES (4, 'Placki ziemniaczane', 4, 'Na patelni prażymy słonecznik. Następnie smażymy boczek (bez dodatkowego tłuszczu). Kiedy boczek jest chrupiący ściągamy kawałki boczku z patelni i odkładamy.
Do miseczki wlewamy oliwę, miód, musztardę i sok z cytryny. Wszystko dokładnie mieszamy. Następnie doprawiamy solą, pieprzem i ponownie dokładnie mieszamy.
Na talerzu układamy naszą sałatkę. Na dole układamy roszponkę i plastry usmażonego wędzonego boczku. Gruszki  myjemy, wykrawamy gniazda nasienne i kroimy na ósemki. Kawałki gruszek układamy na boczku i polewamy wcześniej przygotowanym sosem.  Sałatkę posypujemy serem pleśniowym i prażonym słonecznikiem.');

INSERT INTO ingredient(quantity, unit, name, recipe_id) VALUES (1000, 'GRAM', 'ziemniaki', 4),
                                                                (3, 'SPOON', 'olej z ryżu', 4),
                                                               (1, 'PIECE', 'cebula', 4),
                                                               (1, 'PIECE', 'czosnek', 4),
                                                               (1, 'PIECE', 'jajka', 4),
                                                               (1, 'SPOON', 'mąka pszenna', 4);
INSERT INTO ingredient(name, recipe_id) VALUES ('sól', 4),
                                               ('pieprz', 4),
                                               ('roszponka', 4);

INSERT INTO recipe (id, name, category_id, preparation) VALUES (5, 'Nuggetsy z kurczaka', 1, 'Mięso umyć, wysuszyć i pokroić w niewielkie, podłużne kawałki.
Płatki kukurydziane włożyć do woreczka i pokruszyć przy użyciu wałka do ciasta.
Jajko rozkłócić w miseczce, dodać miód, musztardę i wymieszać. W drugiej misce wymieszać pokruszone płatki kukurydziane z pieprzem.
Kawałki kurczaka maczać w jajku z miodem i musztardą, a następnie obtaczać w płatkach kukurydzianych i układać na blasze wyłożonej papierem do pieczenia.
Nugetsy piec przez około 20 minut w temp. 180 stopni.');

INSERT INTO ingredient(quantity, unit, name, recipe_id) VALUES (1, 'PIECE', 'pierś z kurczaka', 5),
                                                                (2, 'CUP', 'płatki kukurydziane', 5),
                                                                (1, 'SPOON', 'miód', 5),
                                                                (1, 'SPOON', 'musztarda', 5);
INSERT INTO ingredient(name, recipe_id) VALUES ('sól', 5),
                                               ('pieprz', 5);

INSERT INTO recipe (id, name, category_id, preparation) VALUES (6, 'Zupa pomidorowa', 6, 'Do ugotowanego wywaru wlać słoiczek domowego przecieru pomidorowego (lub 4 łyżki koncentratu pomidorowego).
Zupę zabielić śmietaną 12%. Ugotować makaron i dodać do zupy. Przed podaniem posypać zieleniną .
Nugetsy piec przez około 20 minut w temp. 180 stopni.');

INSERT INTO ingredient(quantity, unit, name, recipe_id) VALUES (2000, 'MILILITERS', 'wywar mięsno-warzywny', 6),
                                                               (1, 'CUP', 'przecier pomidorowy', 6),
                                                               (2, 'SPOON', 'śmietana 12%', 6);
INSERT INTO ingredient(name, recipe_id) VALUES ('sól', 6),
                                               ('pieprz', 6),
                                               ('makaron', 6);

INSERT INTO recipe (id, name, category_id, preparation) VALUES (7, 'Makaron z kurczakiem i cukinią', 2, 'Mięso umyłam, osuszyłam i pokroiłam na małe kawałki.
Cukinie umyłam i pokroiłam w półplasterki.
Pomidory sparzyłam, zdjęłam skórkę, a miąższ pokroiłam na kawałki.
Makaron ugotowałam w osolonej wodzie zgodnie z instrukcją na opakowaniu i odcedziłam.
Na patelni rozgrzałam olej, przełożyłam mięso, doprawiłam solą, pieprzem, papryką ostrą i słodką i podsmażyłam ok. 8-10 min. Następnie dodałam do mięsa przeciśnięty przez praskę czosnek i podsmażyłam ok. 30 s, dodałam na patelnię cukinie, podlałam wodą, wymieszałam. Po ok. minucie przełożyłam na patelnię pomidory, jeszcze raz doprawiłam solą i pieprzem i dusiłam wszystko razem do momentu aż pomidory się rozpadły, cukinia zmiękła i sos lekko odparował. Na koniec przełożyłam na patelnię ugotowany makaron, natkę pietruszki, bazylię, wymieszałam i zdjęłam patelnię z palnika.');

INSERT INTO ingredient(quantity, unit, name, recipe_id) VALUES (2, 'PIECE', 'pierś z kurczaka', 7),
                                                                (2, 'PIECE', 'cukinia', 7),
                                                                (2, 'PIECE', 'pomidor', 7),
                                                                (2, 'PIECE', 'ząbki czornku', 7),
                                                                (2, 'SPOON', 'natka pietruszki', 7),
                                                                (250, 'GRAM', 'makaron penne', 7),
                                                                (2, 'SPOON', 'OLEJ', 7);

INSERT INTO ingredient(name, recipe_id) VALUES ('sól', 7),
                                               ('pieprz', 7),
                                               ('papryka ostra i słodka', 7);

INSERT INTO recipe (id, name, category_id, preparation) VALUES (8, 'Babeczki orzechowe', 5, 'Do jednej miski wsypałam mąkę, sodę, cukier trzcinowy i wymieszałam.
Do drugiej miski wlałam mleko, dodałam olej z ryżu naturalny 100% procent SoRiso, jajka i wymieszałam rózgą. Mokre składniki wlałam do miski z suchymi składnikami i wymieszałam. Następnie dodałam do ciasta krem orzechowy 100% z kawałkami orzechów SOWELL, rozgniecionego banana, posiekaną gorzką czekoladę i wymieszałam.
Ciasto przełożyłam do foremek na muffinki (nałożyłam ciasto do 2/3 wysokości foremki).
Foremki z ciastem wstawiłam do piekarnika nagrzanego do 180 stopni (grzanie góra i dół) i piekłam 25 minut.
Upieczone muffinki wystudziłam na kratce.');
INSERT INTO ingredient(quantity, unit, name, recipe_id) VALUES (1.5, 'CUP', 'mąka pszenna', 8),
                                                               (0.5, 'CUP', 'cukier', 8),
                                                               (2, 'PIECE', 'jajka', 8),
                                                               (1, 'PIECE', 'banan', 8),
                                                               (0.6, 'CUP', 'mleko', 8),
                                                               (6, 'SPOON', 'oleju', 8),
                                                               (1, 'TEASPOON', 'sody', 8),
                                                               (100, 'GRAM', 'masło orzechowe', 8),
                                                               (100, 'GRAM', 'gorzka czekolada', 8);

INSERT INTO ingredient(name, recipe_id) VALUES ('sól', 8),
                                               ('pieprz', 8),
                                               ('papryka ostra i słodka', 8);




