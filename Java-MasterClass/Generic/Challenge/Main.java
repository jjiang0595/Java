package Challenge;

public class Main {
    public static void main(String[] args) {
        League<Generic.Team<Generic.FootballPlayer>> footballLeague = new League<>("AFL");
        Generic.Team<Generic.FootballPlayer> adelaideCrows = new Generic.Team<>("Adelaide Crow");
        Generic.Team<Generic.FootballPlayer> melbourne = new Generic.Team<>("Melbourne");
        Generic.Team<Generic.FootballPlayer> hawthorne = new Generic.Team<>("Hawthorn");
        Generic.Team<Generic.FootballPlayer> fremantle = new Generic.Team<>("Fremantle");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorne);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();
    }
}
