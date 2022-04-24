# MS-Kubernetes-ConfigMap
this repo is used to describe how to create a microservice using intellij+spring boot+kubernetes and create a configmap and put a variable inside it to let the ms access the variable and display it to the user when entering /secret 




-----------------------------------------------------
the following steps will help you to run the ms inside the kubernetes in gke

1-build your ms code to a jar in intellij 
2-docker build -f Dockerfile -t sec .
-----------------------------------------

3-save the image to dockerhub:
 a-login into docker my user is xxyazan00
 b-docker tag sec xxyazan00/sec
 c-docker push xxyazan00/sec

--------------------------------
4-now in the gke:
 a-kubectl create deployment sec --image=xxyazan00/sec:latest
 b-kubectl expose deployment sec --type=LoadBalancer --name=sec-service --port 8080
 c-kubectl autoscale deployment sec --max 6 --min      //for insufficient memory error
 
 -------------------------------------------
5-configmap creation:
 a-kubectl create deployment sec --image=xxyazan00/sec:latest  --dry-run -oyaml > dep.yaml
 b-kubectl create deployment sec --image=xxyazan00/sec:latest  
 
 -------------------------------------------
6-to go in inside the pod 
kubectl exec --stdin --tty Name_of_the_Mc -- /bin/bash


7-to ensure our value is working go inside the pod and echo the value using 
echo $APPUSERNAME








