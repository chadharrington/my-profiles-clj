{:user
 {:signing {:gpg-key "chad@farbetter.com"}
  :injections [(require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]

  :repl-options
  {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :plugins
  [[com.jakemccrary/lein-test-refresh "0.18.1"]
   [lein-ancient "0.6.10"
    :exclusions [com.amazonaws/aws-java-sdk-core
                 com.amazonaws/aws-java-sdk-s3
                 commons-codec
                 org.apache.httpcomponents/httpclient
                 org.clojure/clojure]]
   [lein-bikeshed "0.4.1"
    :exclusions [org.clojure/clojure org.clojure/tools.cli]]
   [lein-cljfmt "0.5.6" :exclusions [org.clojure/clojure]]
   [lein-cloverage "1.0.9"]
   [lein-cprint "1.2.0" :exclusions [org.clojure/clojure]]
   [lein-pprint "1.1.2"]
   [jonase/eastwood "0.2.3" :exclusions [org.clojure/clojure]]
   [lein-kibit "0.1.2" :exclusions [org.clojure/clojure]]
   ;;   [cider/cider-nrepl "0.14.0"]
   ;;   [cider/cider-nrepl "0.15.0-SNAPSHOT"]
   [lein-try "0.4.3"]]

  ;; For Charles proxying

  ;; :jvm-opts
  ;; ["-DproxySet=true"
  ;;  "-DproxyHost=127.0.0.1"
  ;;  "-DproxyPort=8888"
  ;;  "-Djavax.net.ssl.trustStore=/Users/chad/.charles/CharlesKeystore"
  ;;  "-Djavax.net.ssl.trustStorePassword=Charles"]

  :dependencies
  [[com.cemerick/piggieback "0.2.1"
    :exclusions [org.clojure/clojurescript org.hamcrest/hamcrest-core]]
   [org.clojure/tools.namespace "0.2.11"]
   [pjstadig/humane-test-output "0.8.1"]]

  :test-refresh {:notify-command ["terminal-notifier"
                                  "-title" "Tests" "-message"]}}

 :repl {:dependencies [[org.clojure/tools.nrepl "0.2.12"]]}}
