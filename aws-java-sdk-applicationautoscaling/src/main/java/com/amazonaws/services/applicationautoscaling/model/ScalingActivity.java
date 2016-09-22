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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * An object representing a scaling activity.
 * </p>
 */
public class ScalingActivity implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier string for the scaling activity.
     * </p>
     */
    private String activityId;
    /**
     * <p>
     * The namespace for the AWS service that the scaling activity is associated with. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces">AWS
     * Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scaling activity. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The scalable dimension associated with the scaling activity. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request.
     * </p>
     */
    private String scalableDimension;
    /**
     * <p>
     * A simple description of what action the scaling activity intends to accomplish.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A simple description of what caused the scaling activity to happen.
     * </p>
     */
    private String cause;
    /**
     * <p>
     * The Unix timestamp for when the scaling activity began.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The Unix timestamp for when the scaling activity ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Indicates the status of the scaling activity.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * A simple message about the current status of the scaling activity.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The details about the scaling activity.
     * </p>
     */
    private String details;

    /**
     * <p>
     * The unique identifier string for the scaling activity.
     * </p>
     * 
     * @param activityId
     *        The unique identifier string for the scaling activity.
     */

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * <p>
     * The unique identifier string for the scaling activity.
     * </p>
     * 
     * @return The unique identifier string for the scaling activity.
     */

    public String getActivityId() {
        return this.activityId;
    }

    /**
     * <p>
     * The unique identifier string for the scaling activity.
     * </p>
     * 
     * @param activityId
     *        The unique identifier string for the scaling activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingActivity withActivityId(String activityId) {
        setActivityId(activityId);
        return this;
    }

    /**
     * <p>
     * The namespace for the AWS service that the scaling activity is associated with. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces">AWS
     * Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scaling activity is associated with. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The namespace for the AWS service that the scaling activity is associated with. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces">AWS
     * Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @return The namespace for the AWS service that the scaling activity is associated with. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * <p>
     * The namespace for the AWS service that the scaling activity is associated with. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces">AWS
     * Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scaling activity is associated with. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public ScalingActivity withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The namespace for the AWS service that the scaling activity is associated with. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces">AWS
     * Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scaling activity is associated with. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
    }

    /**
     * <p>
     * The namespace for the AWS service that the scaling activity is associated with. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces">AWS
     * Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scaling activity is associated with. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public ScalingActivity withServiceNamespace(ServiceNamespace serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scaling activity. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * 
     * @param resourceId
     *        The resource type and unique identifier string for the resource associated with the scaling activity. For
     *        Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name
     *        and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *        requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *        request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scaling activity. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * 
     * @return The resource type and unique identifier string for the resource associated with the scaling activity. For
     *         Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name
     *         and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *         requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *         request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scaling activity. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * </p>
     * 
     * @param resourceId
     *        The resource type and unique identifier string for the resource associated with the scaling activity. For
     *        Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name
     *        and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *        requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *        request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingActivity withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The scalable dimension associated with the scaling activity. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scaling activity. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request.
     * @see ScalableDimension
     */

    public void setScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension associated with the scaling activity. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @return The scalable dimension associated with the scaling activity. The scalable dimension contains the service
     *         namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *         desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for
     *         the target capacity of an Amazon EC2 Spot fleet request.
     * @see ScalableDimension
     */

    public String getScalableDimension() {
        return this.scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension associated with the scaling activity. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scaling activity. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public ScalingActivity withScalableDimension(String scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The scalable dimension associated with the scaling activity. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scaling activity. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request.
     * @see ScalableDimension
     */

    public void setScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
    }

    /**
     * <p>
     * The scalable dimension associated with the scaling activity. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scaling activity. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public ScalingActivity withScalableDimension(ScalableDimension scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * A simple description of what action the scaling activity intends to accomplish.
     * </p>
     * 
     * @param description
     *        A simple description of what action the scaling activity intends to accomplish.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A simple description of what action the scaling activity intends to accomplish.
     * </p>
     * 
     * @return A simple description of what action the scaling activity intends to accomplish.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A simple description of what action the scaling activity intends to accomplish.
     * </p>
     * 
     * @param description
     *        A simple description of what action the scaling activity intends to accomplish.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingActivity withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A simple description of what caused the scaling activity to happen.
     * </p>
     * 
     * @param cause
     *        A simple description of what caused the scaling activity to happen.
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * A simple description of what caused the scaling activity to happen.
     * </p>
     * 
     * @return A simple description of what caused the scaling activity to happen.
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * A simple description of what caused the scaling activity to happen.
     * </p>
     * 
     * @param cause
     *        A simple description of what caused the scaling activity to happen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingActivity withCause(String cause) {
        setCause(cause);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the scaling activity began.
     * </p>
     * 
     * @param startTime
     *        The Unix timestamp for when the scaling activity began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The Unix timestamp for when the scaling activity began.
     * </p>
     * 
     * @return The Unix timestamp for when the scaling activity began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The Unix timestamp for when the scaling activity began.
     * </p>
     * 
     * @param startTime
     *        The Unix timestamp for when the scaling activity began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingActivity withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the scaling activity ended.
     * </p>
     * 
     * @param endTime
     *        The Unix timestamp for when the scaling activity ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The Unix timestamp for when the scaling activity ended.
     * </p>
     * 
     * @return The Unix timestamp for when the scaling activity ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The Unix timestamp for when the scaling activity ended.
     * </p>
     * 
     * @param endTime
     *        The Unix timestamp for when the scaling activity ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingActivity withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the scaling activity.
     * </p>
     * 
     * @param statusCode
     *        Indicates the status of the scaling activity.
     * @see ScalingActivityStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * Indicates the status of the scaling activity.
     * </p>
     * 
     * @return Indicates the status of the scaling activity.
     * @see ScalingActivityStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * Indicates the status of the scaling activity.
     * </p>
     * 
     * @param statusCode
     *        Indicates the status of the scaling activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingActivityStatusCode
     */

    public ScalingActivity withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the scaling activity.
     * </p>
     * 
     * @param statusCode
     *        Indicates the status of the scaling activity.
     * @see ScalingActivityStatusCode
     */

    public void setStatusCode(ScalingActivityStatusCode statusCode) {
        this.statusCode = statusCode.toString();
    }

    /**
     * <p>
     * Indicates the status of the scaling activity.
     * </p>
     * 
     * @param statusCode
     *        Indicates the status of the scaling activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingActivityStatusCode
     */

    public ScalingActivity withStatusCode(ScalingActivityStatusCode statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * A simple message about the current status of the scaling activity.
     * </p>
     * 
     * @param statusMessage
     *        A simple message about the current status of the scaling activity.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A simple message about the current status of the scaling activity.
     * </p>
     * 
     * @return A simple message about the current status of the scaling activity.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A simple message about the current status of the scaling activity.
     * </p>
     * 
     * @param statusMessage
     *        A simple message about the current status of the scaling activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingActivity withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The details about the scaling activity.
     * </p>
     * 
     * @param details
     *        The details about the scaling activity.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * The details about the scaling activity.
     * </p>
     * 
     * @return The details about the scaling activity.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * The details about the scaling activity.
     * </p>
     * 
     * @param details
     *        The details about the scaling activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingActivity withDetails(String details) {
        setDetails(details);
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
        if (getActivityId() != null)
            sb.append("ActivityId: " + getActivityId() + ",");
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: " + getServiceNamespace() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getScalableDimension() != null)
            sb.append("ScalableDimension: " + getScalableDimension() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCause() != null)
            sb.append("Cause: " + getCause() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingActivity == false)
            return false;
        ScalingActivity other = (ScalingActivity) obj;
        if (other.getActivityId() == null ^ this.getActivityId() == null)
            return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false)
            return false;
        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null)
            return false;
        if (other.getServiceNamespace() != null && other.getServiceNamespace().equals(this.getServiceNamespace()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getScalableDimension() == null ^ this.getScalableDimension() == null)
            return false;
        if (other.getScalableDimension() != null && other.getScalableDimension().equals(this.getScalableDimension()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivityId() == null) ? 0 : getActivityId().hashCode());
        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getScalableDimension() == null) ? 0 : getScalableDimension().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public ScalingActivity clone() {
        try {
            return (ScalingActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
