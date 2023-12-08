(defproject africastalking-account "0.1.0-SNAPSHOT"
  :description "Retrieve account data from Africa's Talking"
  :license {:name "AGPL-3.0-or-later"
            :url "https://www.gnu.org/licenses/agpl-3.0"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/data.csv "1.0.1"]
                 [clj-http "3.12.3"]
                 [environ "1.2.0"]]
  :profiles {:dev {:dependencies [[philoskim/debux "0.9.1"]]}
             :uberjar {:dependencies [[philoskim/debux-stubs "0.8.2"]]}}
  :repl-options {:init-ns com.mobileafya.africastalking-account.ussd-sessions})
