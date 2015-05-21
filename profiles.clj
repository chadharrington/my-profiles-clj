{:user
 {:signing {:gpg-key "chad@farbetter.com"}
  :dependencies [[pjstadig/humane-test-output "0.7.0"]
                 [mvxcvi/puget "0.8.1"]
                 [rhizome "0.2.5"]]
  :injections [(require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]
  :plugins [[cider/cider-nrepl "0.8.2"]
            [com.jakemccrary/lein-test-refresh "0.9.0"]
            [jonase/eastwood "0.2.1"]
            [lein-ancient "0.6.7"]
            [lein-bikeshed "0.2.0"]
            [lein-cloverage "1.0.3"]
            [lein-cprint "1.0.0"]
            [lein-kibit "0.1.2"]
            [lein-try "0.4.3"]]
  :test-refresh {:notify-command ["terminal-notifier"
                                  "-title" "Tests" "-message"]}}}
