require 'buildr/git_auto_version'
require 'buildr/gpg'

desc 'javax.annotation: A minimal, J2CL compatible javax.annotation library'
define 'javax.annotation' do
  project.group = 'org.realityforge.javax.annotation'
  compile.options.source = '1.8'
  compile.options.target = '1.8'
  compile.options.lint = 'all'

  project.version = ENV['PRODUCT_VERSION'] if ENV['PRODUCT_VERSION']

  pom.add_apache_v2_license
  pom.add_github_project('realityforge/javax.annotation')
  pom.add_developer('realityforge', 'Peter Donald')

  package(:jar)
  package(:sources)
  package(:javadoc)

  ipr.add_component_from_artifact(:idea_codestyle)
end
