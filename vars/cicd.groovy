def newGit(repo)
{
   git "http://github.com/bathulagopiraju/${repo}.git"
}


def newMaven()
{
   sh 'mvn package'
}
