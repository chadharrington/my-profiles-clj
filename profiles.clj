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
  [[cider/cider-nrepl "0.10.0"]
   [com.jakemccrary/lein-test-refresh "0.12.0"]
   [jonase/eastwood "0.2.3"]
   [lein-ancient "0.6.8"]
   [lein-bikeshed "0.2.0"]
   [lein-cljfmt "0.3.0"]
   [lein-cloverage "1.0.6"]
   [lein-cprint "1.2.0"]
   [lein-kibit "0.1.2"]
   [lein-try "0.4.3"]
   [lein-vanity "0.2.0"]]

  :test-refresh {:notify-command ["terminal-notifier"
                                  "-title" "Tests" "-message"]}}}
