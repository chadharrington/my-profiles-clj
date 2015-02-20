{:user
 {:signing {:gpg-key "chad@farbetter.com"}
  :dependencies [[pjstadig/humane-test-output "0.6.0"]]
  :injections [(require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]
  :plugins [[cider/cider-nrepl "0.8.2"]
            [com.jakemccrary/lein-test-refresh "0.6.0"]
            [jonase/eastwood "0.2.1"]
            [lein-ancient "0.6.3"]
            [lein-bikeshed "0.2.0"]
            [lein-cloverage "1.0.2"]
            [lein-kibit "0.0.8"]]
  :test-refresh {:notify-command ["terminal-notifier"
                                  "-title" "Tests" "-message"]}}}
