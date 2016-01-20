{:user
 {:signing {:gpg-key "chad@farbetter.com"}
  :dependencies
  [[com.cemerick/piggieback "0.2.1"]
   [org.clojure/tools.nrepl "0.2.12"]
   [pjstadig/humane-test-output "0.7.1"]]

  :injections [(require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]

  :repl-options
  {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :plugins
  [[cider/cider-nrepl "0.11.0-SNAPSHOT"]
   [com.jakemccrary/lein-test-refresh "0.12.0"]
   [lein-ancient "0.6.8" :exclusions [org.clojure/clojure]]
   [lein-cprint "1.2.0" :exclusions [org.clojure/clojure]]
   [lein-kibit "0.1.2" :exclusions [org.clojure/clojure]]
   [lein-try "0.4.3"]
   [lein-vanity "0.2.0"]]

  :test-refresh {:notify-command ["terminal-notifier"
                                  "-title" "Tests" "-message"]}}}
