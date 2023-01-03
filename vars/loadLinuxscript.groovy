def call(Map config = [:]){
  def scriptcontents = libraryResource "com/project/scripts/${config.name}"
  writeFile file: "#{config.name}", text: scriptcontents
  sh "chmod a+x ./${config.name}"
}
