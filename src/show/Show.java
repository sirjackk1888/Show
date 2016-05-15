package Show;

import java.util.*;
        
        public class Show {
            private static final Show INSTANCE
                    = new Show();
            private Set<String> availableSeats;
            
            public static synchronized Show GetInstance() {
                return INSTANCE;
            }
            private Show() { 
                
                availableSeats = new HashSet<String>();
                availableSeats.add("1A");
                availableSeats.add("1B");
            }
            
            public boolean bookSeat(String seat) {
                return availableSeats.remove(seat);
            }
            public static void main(String[] args) {
                ticketAgentBooks("1A");
                ticketAgentBooks("1B");
            }
            private static void ticketAgentBooks(String seat) {
                Show show = Show.getInstance();
                System.out.println(show.bookSeat(seat));
            }
        }
                
            
        