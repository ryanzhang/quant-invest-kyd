#/bin/bash
if [ "true" == "$1" ];then
    # oc process postgresql-persistent    -p MEMORY_LIMIT=1Gi    -p POSTGRESQL_USER=user    -p POSTGRESQL_PASSWORD=password    -p POSTGRESQL_DATABASE=market    -p DATABASE_SERVICE_NAME=postgresql   -p VOLUME_CAPACITY=2Gi    -p POSTGRESQL_VERSION=13-el8 -oyaml -n openshift|oc apply -f - 
    oc apply -f .openshift/postgresql-deployment.yaml
    # oc process sso73-ocp4-x509-postgresql-persistent -p APPLICATION_NAME=sso  -p POSTGRESQL_IMAGE_STREAM_TAG=13-el8 -p DB_USERNAME=user -p DB_PASSWORD=password -p JGROUPS_CLUSTER_PASSWORD=password -p SSO_ADMIN_USERNAME=admin -p SSO_ADMIN_PASSWORD=admin -p SSO_REALM=horizon0 -p SSO_SERVICE_PASSWORD=password -p SSO_SERVICE_USERNAME=user -oyaml -n openshift|oc apply -f - 
    # oc apply -f .openshift/sso-deployment.yaml
fi

