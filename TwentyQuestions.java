import java.util.*;

public class TwentyQuestions {
    private String[] possibleAnswers = {"Radiohead", "Beabadoobee", "NLE Choppa", "Destiny's Child", "Ed Sheeran", "Adele", "Taylor Swift", "The Weeknd", "Lady Gaga", "Billie Eilish", "Bruno Mars", "Justin Bieber"};
    private ArrayList<String> currentPossibleAnswers;
    private int questionsAsked;

    public TwentyQuestions() {
        currentPossibleAnswers = new ArrayList<>(); 
        for (String answer : possibleAnswers) {
            currentPossibleAnswers.add(answer); 
        }
        questionsAsked = 0; 
    }

    public void askQuestion() {
        Scanner scanner = new Scanner(System.in);

        while (currentPossibleAnswers.size() > 1) {
            if (questionsAsked >= 20) {
                break; 
            }
        
            String question = generateQuestion();
            System.out.println("Question " + (questionsAsked + 1) + ": " + question + " (yes/no)");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("yes")) {
                updateAnswers(question, true);
                questionsAsked++;
            } else if (answer.equals("no")) {
                updateAnswers(question, false);
                questionsAsked++;
            } else {
                System.out.println("Please answer with 'yes' or 'no'.");
            }
        }

        if (currentPossibleAnswers.size() == 1) {
            System.out.println("I guess the answer is: " + currentPossibleAnswers.get(0));
        } else {
            System.out.println("I couldn't guess the answer within 20 questions.");
        }
    }

    private String generateQuestion() {
        if (questionsAsked == 0) {
            return "Is the artist a female?";
        }
        if (questionsAsked == 1) {
            return "Is the artist known for pop music?";
        }
        if (questionsAsked == 2) {
            return "Is the artist under 30 years old?";
        }
        if (questionsAsked == 3) {
            return "Is the artist from North America?";
        }
        if (questionsAsked == 4) {
            return "Is the artist a solo performer?";
        }
        if (questionsAsked == 5) {
            return "Has the artist won a Grammy award?";
        }
        if (questionsAsked == 6) {
            return "Does the artist have a stage name?";
        }
        if (questionsAsked == 7) {
            return "Does the artist play an instrument on stage (often)?";
        }
        if (questionsAsked == 8) {
            return "Is the artist known for their dance performances?";
        }
        if (questionsAsked == 9) {
            return "Has the artist released more than 3 studio albums?";
        }
        if (questionsAsked == 10) {
            return "Is the artist known for collaborations with other artists?";
        }
        return "Is the artist known for a specific genre of music?";
    }

    private void updateAnswers(String question, boolean answer) {
        ArrayList<String> filteredAnswers = new ArrayList<>();

        for (String artist : currentPossibleAnswers) {
            boolean matches = matchesCriteria(artist, question, answer);
            if (matches) {
                filteredAnswers.add(artist);
            }
        }

        currentPossibleAnswers = filteredAnswers;
        System.out.println("Possible answers remaining: " + currentPossibleAnswers);
    }

    private boolean matchesCriteria(String artist, String question, boolean answer) {
        String[] femaleArtists = {"Beabadoobee", "Destiny's Child", "Adele", "Taylor Swift", "Lady Gaga", "Billie Eilish"};
        String[] maleArtists = {"NLE Choppa", "Ed Sheeran", "Bruno Mars", "Justin Bieber", "Radiohead", "The Weeknd"}; 
        String[] popArtists = {"Ed Sheeran", "Taylor Swift", "The Weeknd", "Lady Gaga", "Billie Eilish", "Bruno Mars", "Justin Bieber"};
        String[] under30Artists = {"Billie Eilish", "Justin Bieber", "NLE Choppa", "Beabadoobee"};
        String[] northAmericanArtists = {"NLE Choppa", "Destiny's Child", "Taylor Swift", "The Weeknd", "Lady Gaga", "Billie Eilish", "Bruno Mars", "Justin Bieber"};
        String[] soloArtists = {"Adele", "Taylor Swift", "Lady Gaga", "Billie Eilish", "Bruno Mars", "Justin Bieber", "Ed Sheeran", "NLE Choppa", "The Weeknd"};
        String[] grammyWinners = {"Destiny's Child", "Ed Sheeran", "Adele", "Taylor Swift", "The Weeknd", "Lady Gaga", "Billie Eilish", "Bruno Mars", "Justin Bieber"};
        String[] stageNameArtists = {"The Weeknd", "Lady Gaga", "Justin Bieber"};
        String[] instrumentPlayers = {"Ed Sheeran","Adele","Bruno Mars"};
        String[] dancePerformanceArtists = {"Destiny's Child", "Taylor Swift", "Lady Gaga", "Bruno Mars", "Justin Bieber"};
        String[] multiAlbumArtists = {"Radiohead", "Destiny's Child", "Ed Sheeran", "Adele", "Taylor Swift", "The Weeknd", "Lady Gaga", "Bruno Mars", "Justin Bieber"};

        if (question.equals("Is the artist a female?")) {
            if (answer) { 
                for (String femaleArtist : femaleArtists) {
                    if (artist.equals(femaleArtist)) {
                        return true; 
                    }
                }
                return false; 
            } 
            else { 
                for (String maleArtist : maleArtists) {
                    if (artist.equals(maleArtist)) {
                        return true; 
                    }
                }
                return false; 
            }
        }

        if (question.equals("Is the artist known for pop music?")) {
            if (answer) {
                for (String popArtist : popArtists) {
                    if (artist.equals(popArtist)) {
                        return true; 
                    }
                }
                return false; 
            }
            else { 
                for (String popArtist : popArtists) {
                    if (artist.equals(popArtist)) {
                        return false; 
                    }
                }
                return true; 
            }
        }

        if (question.equals("Is the artist under 30 years old?")) {
            if (answer) { 
                for (String under30Artist : under30Artists) {
                    if (artist.equals(under30Artist)) {
                        return true; 
                    }
                }
                return false; 
            } 
            else { 
                for (String under30Artist : under30Artists) {
                    if (artist.equals(under30Artist)) {
                        return false; 
                    }
                }
                return true; 
            }
        }

        if (question.equals("Is the artist from North America?")) {
            if (answer) {
                for (String northAmericanArtist : northAmericanArtists) {
                    if (artist.equals(northAmericanArtist)) {
                        return true; 
                    }
                }
                return false; 
            }
            else { 
                for (String northAmericanArtist : northAmericanArtists) {
                    if (artist.equals(northAmericanArtist)) {
                        return false; 
                    }
                }
                return true; 
            }
        }

        if (question.equals("Is the artist a solo performer?")) {
            if (answer) {
                for (String soloArtist : soloArtists) {
                    if (artist.equals(soloArtist)) {
                        return true; 
                    }
                }
                return false; 
            }
            else { 
                for (String soloArtist : soloArtists) {
                    if (artist.equals(soloArtist)) {
                        return false; 
                    }
                }
                return true; 
            }
        }

        if (question.equals("Has the artist won a Grammy award?")) {
            if (answer) {
                for (String grammyWinner : grammyWinners) {
                    if (artist.equals(grammyWinner)) {
                        return true; 
                    }
                }
                return false; 
            }
            else { 
                for (String grammyWinner : grammyWinners) {
                    if (artist.equals(grammyWinner)) {
                        return false; 
                    }
                }
                return true; 
            }
        }

        if (question.equals("Does the artist have a stage name?")) {
            if (answer) {
                for (String stageNameArtist : stageNameArtists) {
                    if (artist.equals(stageNameArtist)) {
                        return true; 
                    }
                }
                return false; 
            }
            else { 
                for (String stageNameArtist : stageNameArtists) {
                    if (artist.equals(stageNameArtist)) {
                        return false; 
                    }
                }
                return true; 
            }
        }

        if (question.equals("Does the artist play an instrument on stage (often)?")) {
            if (answer) {
                for (String instrumentPlayer : instrumentPlayers) {
                    if (artist.equals(instrumentPlayer)) {
                        return true; 
                    }
                }
                return false; 
            }
            else { 
                for (String instrumentPlayer : instrumentPlayers) {
                    if (artist.equals(instrumentPlayer)) {
                        return false; 
                    }
                }
                return true; 
            }
        }

        if (question.equals("Is the artist known for their dance performances?")) {
            if (answer) {
                for (String dancePerformanceArtist : dancePerformanceArtists) {
                    if (artist.equals(dancePerformanceArtist)) {
                        return true; 
                    }
                }
                return false; 
            }
            else { 
                for (String dancePerformanceArtist : dancePerformanceArtists) {
                    if (artist.equals(dancePerformanceArtist)) {
                        return false; 
                    }
                }
                return true; 
            }
        }

        if (question.equals("Has the artist released more than 3 studio albums?")) {
            if (answer) {
                for (String multiAlbumArtist : multiAlbumArtists) {
                    if (artist.equals(multiAlbumArtist)) {
                        return true; 
                    }
                }
                return false; 
            }
            else { 
                for (String multiAlbumArtist : multiAlbumArtists) {
                    if (artist.equals(multiAlbumArtist)) {
                        return false; 
                    }
                }
                return true; 
            }
        }
        return false;
    }


    public static void main(String[] args) {
        TwentyQuestions game = new TwentyQuestions();
        game.askQuestion();
    }
}