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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeScalableTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace for the AWS service that the scalable target is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scalable target. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you specify a scalable dimension,
     * you must also specify a resource ID.
     * </p>
     */
    private java.util.List<String> resourceIds;
    /**
     * <p>
     * The scalable dimension associated with the scalable target. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request. If you specify a scalable dimension, you must also specify a
     * resource ID.
     * </p>
     */
    private String scalableDimension;
    /**
     * <p>
     * The maximum number of scalable target results returned by <code>DescribeScalableTargets</code> in paginated
     * output. When this parameter is used, <code>DescribeScalableTargets</code> returns up to <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeScalableTargets</code> request with the returned
     * <code>NextToken</code> value. This value can be between 1 and 50. If this parameter is not used, then
     * <code>DescribeScalableTargets</code> returns up to 50 results and a <code>NextToken</code> value, if applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalableTargets</code> request.
     * Pagination continues from the end of the previous results that returned the <code>NextToken</code> value. This
     * value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The namespace for the AWS service that the scalable target is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scalable target is associated with. For more information, see
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
     * The namespace for the AWS service that the scalable target is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @return The namespace for the AWS service that the scalable target is associated with. For more information, see
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
     * The namespace for the AWS service that the scalable target is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scalable target is associated with. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public DescribeScalableTargetsRequest withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The namespace for the AWS service that the scalable target is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scalable target is associated with. For more information, see
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
     * The namespace for the AWS service that the scalable target is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The namespace for the AWS service that the scalable target is associated with. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public DescribeScalableTargetsRequest withServiceNamespace(ServiceNamespace serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scalable target. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you specify a scalable dimension,
     * you must also specify a resource ID.
     * </p>
     * 
     * @return The resource type and unique identifier string for the resource associated with the scalable target. For
     *         Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name
     *         and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *         requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *         request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you
     *         specify a scalable dimension, you must also specify a resource ID.
     */

    public java.util.List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scalable target. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you specify a scalable dimension,
     * you must also specify a resource ID.
     * </p>
     * 
     * @param resourceIds
     *        The resource type and unique identifier string for the resource associated with the scalable target. For
     *        Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name
     *        and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *        requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *        request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you
     *        specify a scalable dimension, you must also specify a resource ID.
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new java.util.ArrayList<String>(resourceIds);
    }

    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scalable target. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you specify a scalable dimension,
     * you must also specify a resource ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The resource type and unique identifier string for the resource associated with the scalable target. For
     *        Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name
     *        and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *        requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *        request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you
     *        specify a scalable dimension, you must also specify a resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalableTargetsRequest withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new java.util.ArrayList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource type and unique identifier string for the resource associated with the scalable target. For Amazon
     * ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and service
     * name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the resource
     * type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you specify a scalable dimension,
     * you must also specify a resource ID.
     * </p>
     * 
     * @param resourceIds
     *        The resource type and unique identifier string for the resource associated with the scalable target. For
     *        Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name
     *        and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *        requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *        request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you
     *        specify a scalable dimension, you must also specify a resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalableTargetsRequest withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request. If you specify a scalable dimension, you must also specify a
     * resource ID.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scalable target. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request. If you specify a scalable dimension, you must also
     *        specify a resource ID.
     * @see ScalableDimension
     */

    public void setScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request. If you specify a scalable dimension, you must also specify a
     * resource ID.
     * </p>
     * 
     * @return The scalable dimension associated with the scalable target. The scalable dimension contains the service
     *         namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *         desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for
     *         the target capacity of an Amazon EC2 Spot fleet request. If you specify a scalable dimension, you must
     *         also specify a resource ID.
     * @see ScalableDimension
     */

    public String getScalableDimension() {
        return this.scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request. If you specify a scalable dimension, you must also specify a
     * resource ID.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scalable target. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request. If you specify a scalable dimension, you must also
     *        specify a resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public DescribeScalableTargetsRequest withScalableDimension(String scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request. If you specify a scalable dimension, you must also specify a
     * resource ID.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scalable target. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request. If you specify a scalable dimension, you must also
     *        specify a resource ID.
     * @see ScalableDimension
     */

    public void setScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
    }

    /**
     * <p>
     * The scalable dimension associated with the scalable target. The scalable dimension contains the service
     * namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the desired
     * task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the target
     * capacity of an Amazon EC2 Spot fleet request. If you specify a scalable dimension, you must also specify a
     * resource ID.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension associated with the scalable target. The scalable dimension contains the service
     *        namespace, resource type, and scaling property, such as <code>ecs:service:DesiredCount</code> for the
     *        desired task count of an Amazon ECS service, or <code>ec2:spot-fleet-request:TargetCapacity</code> for the
     *        target capacity of an Amazon EC2 Spot fleet request. If you specify a scalable dimension, you must also
     *        specify a resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public DescribeScalableTargetsRequest withScalableDimension(ScalableDimension scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The maximum number of scalable target results returned by <code>DescribeScalableTargets</code> in paginated
     * output. When this parameter is used, <code>DescribeScalableTargets</code> returns up to <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeScalableTargets</code> request with the returned
     * <code>NextToken</code> value. This value can be between 1 and 50. If this parameter is not used, then
     * <code>DescribeScalableTargets</code> returns up to 50 results and a <code>NextToken</code> value, if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of scalable target results returned by <code>DescribeScalableTargets</code> in
     *        paginated output. When this parameter is used, <code>DescribeScalableTargets</code> returns up to
     *        <code>MaxResults</code> results in a single page along with a <code>NextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>DescribeScalableTargets</code> request with the returned <code>NextToken</code> value. This value
     *        can be between 1 and 50. If this parameter is not used, then <code>DescribeScalableTargets</code> returns
     *        up to 50 results and a <code>NextToken</code> value, if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of scalable target results returned by <code>DescribeScalableTargets</code> in paginated
     * output. When this parameter is used, <code>DescribeScalableTargets</code> returns up to <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeScalableTargets</code> request with the returned
     * <code>NextToken</code> value. This value can be between 1 and 50. If this parameter is not used, then
     * <code>DescribeScalableTargets</code> returns up to 50 results and a <code>NextToken</code> value, if applicable.
     * </p>
     * 
     * @return The maximum number of scalable target results returned by <code>DescribeScalableTargets</code> in
     *         paginated output. When this parameter is used, <code>DescribeScalableTargets</code> returns up to
     *         <code>MaxResults</code> results in a single page along with a <code>NextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending another
     *         <code>DescribeScalableTargets</code> request with the returned <code>NextToken</code> value. This value
     *         can be between 1 and 50. If this parameter is not used, then <code>DescribeScalableTargets</code> returns
     *         up to 50 results and a <code>NextToken</code> value, if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of scalable target results returned by <code>DescribeScalableTargets</code> in paginated
     * output. When this parameter is used, <code>DescribeScalableTargets</code> returns up to <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeScalableTargets</code> request with the returned
     * <code>NextToken</code> value. This value can be between 1 and 50. If this parameter is not used, then
     * <code>DescribeScalableTargets</code> returns up to 50 results and a <code>NextToken</code> value, if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of scalable target results returned by <code>DescribeScalableTargets</code> in
     *        paginated output. When this parameter is used, <code>DescribeScalableTargets</code> returns up to
     *        <code>MaxResults</code> results in a single page along with a <code>NextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>DescribeScalableTargets</code> request with the returned <code>NextToken</code> value. This value
     *        can be between 1 and 50. If this parameter is not used, then <code>DescribeScalableTargets</code> returns
     *        up to 50 results and a <code>NextToken</code> value, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalableTargetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalableTargets</code> request.
     * Pagination continues from the end of the previous results that returned the <code>NextToken</code> value. This
     * value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalableTargets</code>
     *        request. Pagination continues from the end of the previous results that returned the
     *        <code>NextToken</code> value. This value is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalableTargets</code> request.
     * Pagination continues from the end of the previous results that returned the <code>NextToken</code> value. This
     * value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalableTargets</code>
     *         request. Pagination continues from the end of the previous results that returned the
     *         <code>NextToken</code> value. This value is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalableTargets</code> request.
     * Pagination continues from the end of the previous results that returned the <code>NextToken</code> value. This
     * value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalableTargets</code>
     *        request. Pagination continues from the end of the previous results that returned the
     *        <code>NextToken</code> value. This value is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalableTargetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: " + getServiceNamespace() + ",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: " + getResourceIds() + ",");
        if (getScalableDimension() != null)
            sb.append("ScalableDimension: " + getScalableDimension() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScalableTargetsRequest == false)
            return false;
        DescribeScalableTargetsRequest other = (DescribeScalableTargetsRequest) obj;
        if (other.getServiceNamespace() == null ^ this.getServiceNamespace() == null)
            return false;
        if (other.getServiceNamespace() != null && other.getServiceNamespace().equals(this.getServiceNamespace()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        if (other.getScalableDimension() == null ^ this.getScalableDimension() == null)
            return false;
        if (other.getScalableDimension() != null && other.getScalableDimension().equals(this.getScalableDimension()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode + ((getScalableDimension() == null) ? 0 : getScalableDimension().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScalableTargetsRequest clone() {
        return (DescribeScalableTargetsRequest) super.clone();
    }
}
