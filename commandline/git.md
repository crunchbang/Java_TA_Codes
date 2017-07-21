
# Get started with [Git](https://git-scm.com/)



## Cheat Sheet

### Local Workflow:

**git init**: put Git in this folder so that it keeps track of changes to files in this folder and subfolders

*Working Directory*: the directory you’re writing code in

*Staging Area*: files are in the staging area if the changes in them will be included in the next save point

*Repository*: everything Git is keeping track of

**git status**: show me which files have been changed and which ones are ready to be committed

**git add filename.txt**: include the changes to this file in the next commit

**git commit -m “commit message”**: wrap up all these changes and save them together with a short description of the changes

**git log**: show a history of all commits

**git diff**: show what is different from the last commit line by line

**git diff 234nod**: show what is different between the commit 234nod and current state, line by line

### Remote Repository

**git remote add origin address-of-remote**: make address-of-remote a new place to put my code and call it “origin”

**git push -u origin master**: push my code to the location origin points to, on the master branch, and also in the future I will pull code from this same location

*Upstream*: where I will pull code from in the future

*Origin*: where I put backups or share my code

**git pull**: grab code from another repository

**git fetch**: grab code from another repository

**git push**: save my history and changes in another location

*Fork*: I want a GitHub repo that looks like someone else’s repo

*Pull Request*: I made some changes that I would like you to include in your repository, please accept them

**git clone**: give me the code at this location

---
References:\
[How to teach Git](https://recompilermag.com/issues/issue-1/how-to-teach-git/)

#### Extra Stuff:
* [Peepcode - Git internals](https://github.com/pluralsight/git-internals-pdf/raw/master/drafts/peepcode-git.pdf)
* [Introduction to Git with Scott Chacon of GitHub](https://www.youtube.com/watch?v=ZDR433b0HJY)
* [Making a Pull Request](https://www.atlassian.com/git/tutorials/making-a-pull-request)

