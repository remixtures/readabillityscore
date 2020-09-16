Command-line based program that assesses the difficulty level of a given text and the most apropriate age for reading it according to the scores of four indexes of textual statistics. 

After reading a file passed by the user through the command line arguments, the program prints:

- its number of words;
- its number of sentences;
- its number of characters;
- its number of syllables;
- its number of polysyllables;

Afterwards, the user is asked to choose between typing the initials of one of the indexes to get its score or to type "all" to obtain all of the four scores.

The four readability indexes are: 

- "ARI": Automated Readability Index - https://en.wikipedia.org/wiki/Automated_readability_index;
- "FK": Flesch-Kincaid Readability Tests - https://en.wikipedia.org/wiki/Flesch%E2%80%93Kincaid_readability_tests;
- "SMOG": Simple Measure of Gobbledygook - https://en.wikipedia.org/wiki/SMOG;
- "CL": Coleman-Liau Index - https://en.wikipedia.org/wiki/Coleman%E2%80%93Liau_index;

Finally, the program computes the total average age for all four indexes. 

Example: 

The symbol > represents the user input. Notice that it's not the part of the input.

> java Main in.txt
The text is:
This is the front page of the Simple English Wikipedia. Wikipedias are places where people work together to write encyclopedias in different languages. We use Simple English words and grammar here. The Simple English Wikipedia is for everyone! That includes children and adults who are learning English. There are 142,262 articles on the Simple English Wikipedia. All of the pages are free to use. They have all been published under both the Creative Commons License and the GNU Free Documentation License. You can help here! You may change these pages and make new pages. Read the help pages and other good pages to learn how to write pages here. If you need help, you may ask questions at Simple talk. Use Basic English vocabulary and shorter sentences. This allows people to understand normally complex terms or phrases.

Words: 137
Sentences: 14
Characters: 687
Syllables: 210
Polysyllables: 17
Enter the score you want to calculate (ARI, FK, SMOG, CL, all): all

Automated Readability Index: 7.08 (about 13 year olds).
Flesch–Kincaid readability tests: 6.31 (about 12 year olds).
Simple Measure of Gobbledygook: 9.42 (about 15 year olds).
Coleman–Liau index: 10.66 (about 17 year olds).

This text should be understood in average by 14.25 year olds.