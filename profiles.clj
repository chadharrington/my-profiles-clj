{:user
 {:signing {:gpg-key "chad@deercreeklabs.com"}
  :injections [(require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]

  :plugins
  [[com.jakemccrary/lein-test-refresh "0.20.0"]
   [lein-bikeshed "0.4.1"
    :exclusions [org.clojure/clojure org.clojure/tools.cli]]
   [lein-cljfmt "0.5.7" :exclusions [org.clojure/clojure]]
   [lein-cprint "1.2.0" :exclusions [org.clojure/clojure]]
   [jonase/eastwood "0.2.4" :exclusions [org.clojure/clojure]]
   [lein-kibit "0.1.5" :exclusions [org.clojure/clojure]]
   [lein-try "0.4.3"]]

  :dependencies
  [[org.clojure/tools.nrepl "0.2.13"]
   [pjstadig/humane-test-output "0.8.2"]]

  :test-refresh {:notify-command ["terminal-notifier"
                                  "-title" "Tests" "-message"]}}

 :repl
 {:plugins [[cider/cider-nrepl "0.15.0"]]}}
