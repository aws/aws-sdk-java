/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a deployment error.
 * </p>
 */
public class ErrorInformation implements Serializable, Cloneable {

    /**
     * <p>
     * The error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * APPLICATION_MISSING: The application was missing. This error code will most likely be raised if the application
     * is deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_GROUP_MISSING: The deployment group was missing. This error code will most likely be raised if the
     * deployment group is deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTH_CONSTRAINTS: The deployment failed on too many instances to be successfully deployed within the instance
     * health constraints specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTH_CONSTRAINTS_INVALID: The revision cannot be successfully deployed within the instance health constraints
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM_ROLE_MISSING: The service role cannot be accessed.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM_ROLE_PERMISSIONS: The service role does not have the correct permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_ERROR: There was an internal error.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_EC2_SUBSCRIPTION: The calling account is not subscribed to the Amazon EC2 service.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_INSTANCES: No instance were specified, or no instance can be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVER_MAX_INSTANCES: The maximum number of instance was exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * THROTTLED: The operation was throttled because the calling account exceeded the throttling limits of one or more
     * AWS services.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: The deployment has timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * REVISION_MISSING: The revision ID was missing. This error code will most likely be raised if the revision is
     * deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * An accompanying error message.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * APPLICATION_MISSING: The application was missing. This error code will most likely be raised if the application
     * is deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_GROUP_MISSING: The deployment group was missing. This error code will most likely be raised if the
     * deployment group is deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTH_CONSTRAINTS: The deployment failed on too many instances to be successfully deployed within the instance
     * health constraints specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTH_CONSTRAINTS_INVALID: The revision cannot be successfully deployed within the instance health constraints
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM_ROLE_MISSING: The service role cannot be accessed.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM_ROLE_PERMISSIONS: The service role does not have the correct permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_ERROR: There was an internal error.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_EC2_SUBSCRIPTION: The calling account is not subscribed to the Amazon EC2 service.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_INSTANCES: No instance were specified, or no instance can be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVER_MAX_INSTANCES: The maximum number of instance was exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * THROTTLED: The operation was throttled because the calling account exceeded the throttling limits of one or more
     * AWS services.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: The deployment has timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * REVISION_MISSING: The revision ID was missing. This error code will most likely be raised if the revision is
     * deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The error code:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        APPLICATION_MISSING: The application was missing. This error code will most likely be raised if the
     *        application is deleted after the deployment is created but before it is started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEPLOYMENT_GROUP_MISSING: The deployment group was missing. This error code will most likely be raised if
     *        the deployment group is deleted after the deployment is created but before it is started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HEALTH_CONSTRAINTS: The deployment failed on too many instances to be successfully deployed within the
     *        instance health constraints specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HEALTH_CONSTRAINTS_INVALID: The revision cannot be successfully deployed within the instance health
     *        constraints specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IAM_ROLE_MISSING: The service role cannot be accessed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IAM_ROLE_PERMISSIONS: The service role does not have the correct permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INTERNAL_ERROR: There was an internal error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_EC2_SUBSCRIPTION: The calling account is not subscribed to the Amazon EC2 service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_INSTANCES: No instance were specified, or no instance can be found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OVER_MAX_INSTANCES: The maximum number of instance was exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        THROTTLED: The operation was throttled because the calling account exceeded the throttling limits of one
     *        or more AWS services.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TIMEOUT: The deployment has timed out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REVISION_MISSING: The revision ID was missing. This error code will most likely be raised if the revision
     *        is deleted after the deployment is created but before it is started.
     *        </p>
     *        </li>
     * @see ErrorCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * APPLICATION_MISSING: The application was missing. This error code will most likely be raised if the application
     * is deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_GROUP_MISSING: The deployment group was missing. This error code will most likely be raised if the
     * deployment group is deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTH_CONSTRAINTS: The deployment failed on too many instances to be successfully deployed within the instance
     * health constraints specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTH_CONSTRAINTS_INVALID: The revision cannot be successfully deployed within the instance health constraints
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM_ROLE_MISSING: The service role cannot be accessed.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM_ROLE_PERMISSIONS: The service role does not have the correct permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_ERROR: There was an internal error.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_EC2_SUBSCRIPTION: The calling account is not subscribed to the Amazon EC2 service.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_INSTANCES: No instance were specified, or no instance can be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVER_MAX_INSTANCES: The maximum number of instance was exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * THROTTLED: The operation was throttled because the calling account exceeded the throttling limits of one or more
     * AWS services.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: The deployment has timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * REVISION_MISSING: The revision ID was missing. This error code will most likely be raised if the revision is
     * deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The error code:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         APPLICATION_MISSING: The application was missing. This error code will most likely be raised if the
     *         application is deleted after the deployment is created but before it is started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DEPLOYMENT_GROUP_MISSING: The deployment group was missing. This error code will most likely be raised if
     *         the deployment group is deleted after the deployment is created but before it is started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HEALTH_CONSTRAINTS: The deployment failed on too many instances to be successfully deployed within the
     *         instance health constraints specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HEALTH_CONSTRAINTS_INVALID: The revision cannot be successfully deployed within the instance health
     *         constraints specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IAM_ROLE_MISSING: The service role cannot be accessed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         IAM_ROLE_PERMISSIONS: The service role does not have the correct permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INTERNAL_ERROR: There was an internal error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NO_EC2_SUBSCRIPTION: The calling account is not subscribed to the Amazon EC2 service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NO_INSTANCES: No instance were specified, or no instance can be found.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OVER_MAX_INSTANCES: The maximum number of instance was exceeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         THROTTLED: The operation was throttled because the calling account exceeded the throttling limits of one
     *         or more AWS services.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TIMEOUT: The deployment has timed out.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REVISION_MISSING: The revision ID was missing. This error code will most likely be raised if the revision
     *         is deleted after the deployment is created but before it is started.
     *         </p>
     *         </li>
     * @see ErrorCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * APPLICATION_MISSING: The application was missing. This error code will most likely be raised if the application
     * is deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_GROUP_MISSING: The deployment group was missing. This error code will most likely be raised if the
     * deployment group is deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTH_CONSTRAINTS: The deployment failed on too many instances to be successfully deployed within the instance
     * health constraints specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTH_CONSTRAINTS_INVALID: The revision cannot be successfully deployed within the instance health constraints
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM_ROLE_MISSING: The service role cannot be accessed.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM_ROLE_PERMISSIONS: The service role does not have the correct permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_ERROR: There was an internal error.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_EC2_SUBSCRIPTION: The calling account is not subscribed to the Amazon EC2 service.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_INSTANCES: No instance were specified, or no instance can be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVER_MAX_INSTANCES: The maximum number of instance was exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * THROTTLED: The operation was throttled because the calling account exceeded the throttling limits of one or more
     * AWS services.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: The deployment has timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * REVISION_MISSING: The revision ID was missing. This error code will most likely be raised if the revision is
     * deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The error code:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        APPLICATION_MISSING: The application was missing. This error code will most likely be raised if the
     *        application is deleted after the deployment is created but before it is started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEPLOYMENT_GROUP_MISSING: The deployment group was missing. This error code will most likely be raised if
     *        the deployment group is deleted after the deployment is created but before it is started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HEALTH_CONSTRAINTS: The deployment failed on too many instances to be successfully deployed within the
     *        instance health constraints specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HEALTH_CONSTRAINTS_INVALID: The revision cannot be successfully deployed within the instance health
     *        constraints specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IAM_ROLE_MISSING: The service role cannot be accessed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IAM_ROLE_PERMISSIONS: The service role does not have the correct permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INTERNAL_ERROR: There was an internal error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_EC2_SUBSCRIPTION: The calling account is not subscribed to the Amazon EC2 service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_INSTANCES: No instance were specified, or no instance can be found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OVER_MAX_INSTANCES: The maximum number of instance was exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        THROTTLED: The operation was throttled because the calling account exceeded the throttling limits of one
     *        or more AWS services.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TIMEOUT: The deployment has timed out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REVISION_MISSING: The revision ID was missing. This error code will most likely be raised if the revision
     *        is deleted after the deployment is created but before it is started.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ErrorInformation withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * APPLICATION_MISSING: The application was missing. This error code will most likely be raised if the application
     * is deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_GROUP_MISSING: The deployment group was missing. This error code will most likely be raised if the
     * deployment group is deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTH_CONSTRAINTS: The deployment failed on too many instances to be successfully deployed within the instance
     * health constraints specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTH_CONSTRAINTS_INVALID: The revision cannot be successfully deployed within the instance health constraints
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM_ROLE_MISSING: The service role cannot be accessed.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM_ROLE_PERMISSIONS: The service role does not have the correct permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_ERROR: There was an internal error.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_EC2_SUBSCRIPTION: The calling account is not subscribed to the Amazon EC2 service.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_INSTANCES: No instance were specified, or no instance can be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVER_MAX_INSTANCES: The maximum number of instance was exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * THROTTLED: The operation was throttled because the calling account exceeded the throttling limits of one or more
     * AWS services.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: The deployment has timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * REVISION_MISSING: The revision ID was missing. This error code will most likely be raised if the revision is
     * deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The error code:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        APPLICATION_MISSING: The application was missing. This error code will most likely be raised if the
     *        application is deleted after the deployment is created but before it is started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEPLOYMENT_GROUP_MISSING: The deployment group was missing. This error code will most likely be raised if
     *        the deployment group is deleted after the deployment is created but before it is started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HEALTH_CONSTRAINTS: The deployment failed on too many instances to be successfully deployed within the
     *        instance health constraints specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HEALTH_CONSTRAINTS_INVALID: The revision cannot be successfully deployed within the instance health
     *        constraints specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IAM_ROLE_MISSING: The service role cannot be accessed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IAM_ROLE_PERMISSIONS: The service role does not have the correct permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INTERNAL_ERROR: There was an internal error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_EC2_SUBSCRIPTION: The calling account is not subscribed to the Amazon EC2 service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_INSTANCES: No instance were specified, or no instance can be found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OVER_MAX_INSTANCES: The maximum number of instance was exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        THROTTLED: The operation was throttled because the calling account exceeded the throttling limits of one
     *        or more AWS services.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TIMEOUT: The deployment has timed out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REVISION_MISSING: The revision ID was missing. This error code will most likely be raised if the revision
     *        is deleted after the deployment is created but before it is started.
     *        </p>
     *        </li>
     * @see ErrorCode
     */

    public void setCode(ErrorCode code) {
        this.code = code.toString();
    }

    /**
     * <p>
     * The error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * APPLICATION_MISSING: The application was missing. This error code will most likely be raised if the application
     * is deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * <li>
     * <p>
     * DEPLOYMENT_GROUP_MISSING: The deployment group was missing. This error code will most likely be raised if the
     * deployment group is deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTH_CONSTRAINTS: The deployment failed on too many instances to be successfully deployed within the instance
     * health constraints specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * HEALTH_CONSTRAINTS_INVALID: The revision cannot be successfully deployed within the instance health constraints
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM_ROLE_MISSING: The service role cannot be accessed.
     * </p>
     * </li>
     * <li>
     * <p>
     * IAM_ROLE_PERMISSIONS: The service role does not have the correct permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * INTERNAL_ERROR: There was an internal error.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_EC2_SUBSCRIPTION: The calling account is not subscribed to the Amazon EC2 service.
     * </p>
     * </li>
     * <li>
     * <p>
     * NO_INSTANCES: No instance were specified, or no instance can be found.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVER_MAX_INSTANCES: The maximum number of instance was exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * THROTTLED: The operation was throttled because the calling account exceeded the throttling limits of one or more
     * AWS services.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: The deployment has timed out.
     * </p>
     * </li>
     * <li>
     * <p>
     * REVISION_MISSING: The revision ID was missing. This error code will most likely be raised if the revision is
     * deleted after the deployment is created but before it is started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The error code:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        APPLICATION_MISSING: The application was missing. This error code will most likely be raised if the
     *        application is deleted after the deployment is created but before it is started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DEPLOYMENT_GROUP_MISSING: The deployment group was missing. This error code will most likely be raised if
     *        the deployment group is deleted after the deployment is created but before it is started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HEALTH_CONSTRAINTS: The deployment failed on too many instances to be successfully deployed within the
     *        instance health constraints specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HEALTH_CONSTRAINTS_INVALID: The revision cannot be successfully deployed within the instance health
     *        constraints specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IAM_ROLE_MISSING: The service role cannot be accessed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        IAM_ROLE_PERMISSIONS: The service role does not have the correct permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INTERNAL_ERROR: There was an internal error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_EC2_SUBSCRIPTION: The calling account is not subscribed to the Amazon EC2 service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NO_INSTANCES: No instance were specified, or no instance can be found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OVER_MAX_INSTANCES: The maximum number of instance was exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        THROTTLED: The operation was throttled because the calling account exceeded the throttling limits of one
     *        or more AWS services.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TIMEOUT: The deployment has timed out.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REVISION_MISSING: The revision ID was missing. This error code will most likely be raised if the revision
     *        is deleted after the deployment is created but before it is started.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ErrorCode
     */

    public ErrorInformation withCode(ErrorCode code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * An accompanying error message.
     * </p>
     * 
     * @param message
     *        An accompanying error message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An accompanying error message.
     * </p>
     * 
     * @return An accompanying error message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * An accompanying error message.
     * </p>
     * 
     * @param message
     *        An accompanying error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorInformation withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorInformation == false)
            return false;
        ErrorInformation other = (ErrorInformation) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public ErrorInformation clone() {
        try {
            return (ErrorInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
