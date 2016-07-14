{:user
 {:signing {:gpg-key "chad@farbetter.com"}
  :injections [(require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]

  :repl-options
  {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :plugins
  [[com.jakemccrary/lein-test-refresh "0.15.0"]
   [lein-ancient "0.6.10" :exclusions [org.clojure/clojure commons-codec]]
   [lein-bikeshed "0.3.0" :exclusions [org.clojure/clojure]]
   [lein-cloverage "1.0.6"]
   [lein-cprint "1.2.0" :exclusions [org.clojure/clojure]]
   [lein-pprint "1.1.1"]
   ;; Because of confusion with a defunct project also called
   ;; lein-release, we exclude lein-release from lein-ancient.
   [lein-release "1.0.9" :exclusions [org.clojure/clojure] :upgrade false]
   [jonase/eastwood "0.2.3" :exclusions [org.clojure/clojure]]
   [lein-kibit "0.1.2" :exclusions [org.clojure/clojure]]
   [lein-try "0.4.3"]]

  :dependencies
  [[com.cemerick/piggieback "0.2.1"
    :exclusions [org.clojure/clojurescript org.hamcrest/hamcrest-core]]
   [org.clojure/tools.nrepl "0.2.12"]
   [pjstadig/humane-test-output "0.8.0"]]

  :test-refresh {:notify-command ["terminal-notifier"
                                  "-title" "Tests" "-message"]}

  ;; For Charles debugging
  ;; :jvm-opts ["-DproxySet=true"
  ;;            "-DproxyHost=127.0.0.1"
  ;;            "-DproxyPort=8888"
  ;;            "-Djavax.net.ssl.trustStore=/Users/chad/.charles/CharlesKeystore"
  ;;            "-Djavax.net.ssl.trustStorePassword=Charles"]
  }

 :dev
 {:source-paths ["dev"]

  :dependencies
  [[org.clojure/tools.namespace "0.2.11"]]}}
