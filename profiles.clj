{:user
 {:signing {:gpg-key "chad@farbetter.com"}
  :dependencies
  [[com.cemerick/piggieback "0.2.1"]
   [org.clojure/tools.nrepl "0.2.12"]
   [pjstadig/humane-test-output "0.8.0"]]

  :injections [(require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]

  :repl-options
  {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :plugins
  [[cider/cider-nrepl "0.12.0"]
   [com.jakemccrary/lein-test-refresh "0.14.0"]
   [lein-ancient "0.6.10" :exclusions [org.clojure/clojure]]
   [lein-bikeshed "0.3.0"]
   [lein-cprint "1.2.0" :exclusions [org.clojure/clojure]]
   [jonase/eastwood "0.2.3"]
   [lein-kibit "0.1.2" :exclusions [org.clojure/clojure]]
   [lein-try "0.4.3"]]

  :test-refresh {:notify-command ["terminal-notifier"
                                  "-title" "Tests" "-message"]}}}
