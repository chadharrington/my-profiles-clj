{:user
 {:signing {:gpg-key "chad@farbetter.com"}
  :injections [(require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]

  :repl-options
  {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :plugins
  [[cider/cider-nrepl "0.12.0"]
   [com.jakemccrary/lein-test-refresh "0.14.0"]
   [lein-ancient "0.6.10" :exclusions [org.clojure/clojure commons-codec]]
   [lein-bikeshed "0.3.0" :exclusions [org.clojure/clojure]]
   [lein-cloverage "1.0.6"]
   [lein-cprint "1.2.0" :exclusions [org.clojure/clojure]]
   ;; Because of confusion with a defunct project also called
   ;; lein-release, we exclude lein-release from lein-ancient.
   [lein-release "1.0.9" :exclusions [org.clojure/clojure] :upgrade false]
   [jonase/eastwood "0.2.3" :exclusions [org.clojure/clojure]]
   [lein-kibit "0.1.2" :exclusions [org.clojure/clojure]]
   [lein-try "0.4.3"]]

  :dependencies
  [[com.cemerick/piggieback "0.2.1"]
   [org.clojure/tools.nrepl "0.2.12"]
   [pjstadig/humane-test-output "0.8.0"]]

  :test-refresh {:notify-command ["terminal-notifier"
                                  "-title" "Tests" "-message"]}}

 :dev
 {:source-paths ["dev"]

  :dependencies
  [[org.clojure/tools.namespace "0.2.11"]]}}
