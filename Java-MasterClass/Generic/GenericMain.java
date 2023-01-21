package Generic;

public class GenericMain {
    public static void main(String[] args) {
        Generic.FootballPlayer joe = new Generic.FootballPlayer("Joe");
        Generic.BaseballPlayer pat = new Generic.BaseballPlayer("Pat");
        Generic.SoccerPlayer beckham = new Generic.SoccerPlayer("Beckham");

        Generic.Team<Generic.FootballPlayer> footballPlayerTeam = new Generic.Team<>("Adelaide Crows");
        footballPlayerTeam.addPlayer(joe);

        System.out.println(footballPlayerTeam.numPlayers());

        Generic.Team<Generic.BaseballPlayer> baseballPlayerTeam = new Generic.Team<>("Chicago Clubs");
        baseballPlayerTeam.addPlayer(pat);

        System.out.println(baseballPlayerTeam.numPlayers());

        Generic.Team<Generic.SoccerPlayer> soccerPlayerTeam = new Generic.Team<>("Soccer Team");
        soccerPlayerTeam.addPlayer(beckham);
    }
}