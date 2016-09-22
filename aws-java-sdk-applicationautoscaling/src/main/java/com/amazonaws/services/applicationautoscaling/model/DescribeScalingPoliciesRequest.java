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
public class DescribeScalingPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the scaling policies to describe.
     * </p>
     */
    private java.util.List<String> policyNames;
    /**
     * <p>
     * The AWS service namespace of the scalable target that the scaling policy is associated with. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     */
    private String serviceNamespace;
    /**
     * <p>
     * The unique resource identifier string of the scalable target that the scaling policy is associated with. For
     * Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and
     * service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the
     * resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you specify a scalable dimension,
     * you must also specify a resource ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The scalable dimension of the scalable target that the scaling policy is associated with. The scalable dimension
     * contains the service namespace, resource type, and scaling property, such as
     * <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     * <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet request.
     * If you specify a scalable dimension, you must also specify a resource ID.
     * </p>
     */
    private String scalableDimension;
    /**
     * <p>
     * The maximum number of scaling policy results returned by <code>DescribeScalingPolicies</code> in paginated
     * output. When this parameter is used, <code>DescribeScalingPolicies</code> returns up to <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeScalingPolicies</code> request with the returned
     * <code>NextToken</code> value. This value can be between 1 and 50. If this parameter is not used, then
     * <code>DescribeScalingPolicies</code> returns up to 50 results and a <code>NextToken</code> value, if applicable.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalingPolicies</code> request.
     * Pagination continues from the end of the previous results that returned the <code>NextToken</code> value. This
     * value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of the scaling policies to describe.
     * </p>
     * 
     * @return The names of the scaling policies to describe.
     */

    public java.util.List<String> getPolicyNames() {
        return policyNames;
    }

    /**
     * <p>
     * The names of the scaling policies to describe.
     * </p>
     * 
     * @param policyNames
     *        The names of the scaling policies to describe.
     */

    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new java.util.ArrayList<String>(policyNames);
    }

    /**
     * <p>
     * The names of the scaling policies to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyNames(java.util.Collection)} or {@link #withPolicyNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyNames
     *        The names of the scaling policies to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPoliciesRequest withPolicyNames(String... policyNames) {
        if (this.policyNames == null) {
            setPolicyNames(new java.util.ArrayList<String>(policyNames.length));
        }
        for (String ele : policyNames) {
            this.policyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the scaling policies to describe.
     * </p>
     * 
     * @param policyNames
     *        The names of the scaling policies to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPoliciesRequest withPolicyNames(java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
        return this;
    }

    /**
     * <p>
     * The AWS service namespace of the scalable target that the scaling policy is associated with. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The AWS service namespace of the scalable target that the scaling policy is associated with. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(String serviceNamespace) {
        this.serviceNamespace = serviceNamespace;
    }

    /**
     * <p>
     * The AWS service namespace of the scalable target that the scaling policy is associated with. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @return The AWS service namespace of the scalable target that the scaling policy is associated with. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *         >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public String getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * <p>
     * The AWS service namespace of the scalable target that the scaling policy is associated with. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The AWS service namespace of the scalable target that the scaling policy is associated with. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public DescribeScalingPoliciesRequest withServiceNamespace(String serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The AWS service namespace of the scalable target that the scaling policy is associated with. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The AWS service namespace of the scalable target that the scaling policy is associated with. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @see ServiceNamespace
     */

    public void setServiceNamespace(ServiceNamespace serviceNamespace) {
        this.serviceNamespace = serviceNamespace.toString();
    }

    /**
     * <p>
     * The AWS service namespace of the scalable target that the scaling policy is associated with. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     * >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param serviceNamespace
     *        The AWS service namespace of the scalable target that the scaling policy is associated with. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces"
     *        >AWS Service Namespaces</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNamespace
     */

    public DescribeScalingPoliciesRequest withServiceNamespace(ServiceNamespace serviceNamespace) {
        setServiceNamespace(serviceNamespace);
        return this;
    }

    /**
     * <p>
     * The unique resource identifier string of the scalable target that the scaling policy is associated with. For
     * Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and
     * service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the
     * resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you specify a scalable dimension,
     * you must also specify a resource ID.
     * </p>
     * 
     * @param resourceId
     *        The unique resource identifier string of the scalable target that the scaling policy is associated with.
     *        For Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster
     *        name and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *        requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *        request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you
     *        specify a scalable dimension, you must also specify a resource ID.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The unique resource identifier string of the scalable target that the scaling policy is associated with. For
     * Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and
     * service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the
     * resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you specify a scalable dimension,
     * you must also specify a resource ID.
     * </p>
     * 
     * @return The unique resource identifier string of the scalable target that the scaling policy is associated with.
     *         For Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster
     *         name and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *         requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *         request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you
     *         specify a scalable dimension, you must also specify a resource ID.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The unique resource identifier string of the scalable target that the scaling policy is associated with. For
     * Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster name and
     * service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet requests, the
     * resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet request ID; for example,
     * <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you specify a scalable dimension,
     * you must also specify a resource ID.
     * </p>
     * 
     * @param resourceId
     *        The unique resource identifier string of the scalable target that the scaling policy is associated with.
     *        For Amazon ECS services, the resource type is <code>services</code>, and the identifier is the cluster
     *        name and service name; for example, <code>service/default/sample-webapp</code>. For Amazon EC2 Spot fleet
     *        requests, the resource type is <code>spot-fleet-request</code>, and the identifier is the Spot fleet
     *        request ID; for example, <code>spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE</code>. If you
     *        specify a scalable dimension, you must also specify a resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPoliciesRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The scalable dimension of the scalable target that the scaling policy is associated with. The scalable dimension
     * contains the service namespace, resource type, and scaling property, such as
     * <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     * <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet request.
     * If you specify a scalable dimension, you must also specify a resource ID.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension of the scalable target that the scaling policy is associated with. The scalable
     *        dimension contains the service namespace, resource type, and scaling property, such as
     *        <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet
     *        request. If you specify a scalable dimension, you must also specify a resource ID.
     * @see ScalableDimension
     */

    public void setScalableDimension(String scalableDimension) {
        this.scalableDimension = scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension of the scalable target that the scaling policy is associated with. The scalable dimension
     * contains the service namespace, resource type, and scaling property, such as
     * <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     * <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet request.
     * If you specify a scalable dimension, you must also specify a resource ID.
     * </p>
     * 
     * @return The scalable dimension of the scalable target that the scaling policy is associated with. The scalable
     *         dimension contains the service namespace, resource type, and scaling property, such as
     *         <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     *         <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet
     *         request. If you specify a scalable dimension, you must also specify a resource ID.
     * @see ScalableDimension
     */

    public String getScalableDimension() {
        return this.scalableDimension;
    }

    /**
     * <p>
     * The scalable dimension of the scalable target that the scaling policy is associated with. The scalable dimension
     * contains the service namespace, resource type, and scaling property, such as
     * <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     * <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet request.
     * If you specify a scalable dimension, you must also specify a resource ID.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension of the scalable target that the scaling policy is associated with. The scalable
     *        dimension contains the service namespace, resource type, and scaling property, such as
     *        <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet
     *        request. If you specify a scalable dimension, you must also specify a resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public DescribeScalingPoliciesRequest withScalableDimension(String scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The scalable dimension of the scalable target that the scaling policy is associated with. The scalable dimension
     * contains the service namespace, resource type, and scaling property, such as
     * <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     * <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet request.
     * If you specify a scalable dimension, you must also specify a resource ID.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension of the scalable target that the scaling policy is associated with. The scalable
     *        dimension contains the service namespace, resource type, and scaling property, such as
     *        <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet
     *        request. If you specify a scalable dimension, you must also specify a resource ID.
     * @see ScalableDimension
     */

    public void setScalableDimension(ScalableDimension scalableDimension) {
        this.scalableDimension = scalableDimension.toString();
    }

    /**
     * <p>
     * The scalable dimension of the scalable target that the scaling policy is associated with. The scalable dimension
     * contains the service namespace, resource type, and scaling property, such as
     * <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     * <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet request.
     * If you specify a scalable dimension, you must also specify a resource ID.
     * </p>
     * 
     * @param scalableDimension
     *        The scalable dimension of the scalable target that the scaling policy is associated with. The scalable
     *        dimension contains the service namespace, resource type, and scaling property, such as
     *        <code>ecs:service:DesiredCount</code> for the desired task count of an Amazon ECS service, or
     *        <code>ec2:spot-fleet-request:TargetCapacity</code> for the target capacity of an Amazon EC2 Spot fleet
     *        request. If you specify a scalable dimension, you must also specify a resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalableDimension
     */

    public DescribeScalingPoliciesRequest withScalableDimension(ScalableDimension scalableDimension) {
        setScalableDimension(scalableDimension);
        return this;
    }

    /**
     * <p>
     * The maximum number of scaling policy results returned by <code>DescribeScalingPolicies</code> in paginated
     * output. When this parameter is used, <code>DescribeScalingPolicies</code> returns up to <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeScalingPolicies</code> request with the returned
     * <code>NextToken</code> value. This value can be between 1 and 50. If this parameter is not used, then
     * <code>DescribeScalingPolicies</code> returns up to 50 results and a <code>NextToken</code> value, if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of scaling policy results returned by <code>DescribeScalingPolicies</code> in paginated
     *        output. When this parameter is used, <code>DescribeScalingPolicies</code> returns up to
     *        <code>MaxResults</code> results in a single page along with a <code>NextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>DescribeScalingPolicies</code> request with the returned <code>NextToken</code> value. This value
     *        can be between 1 and 50. If this parameter is not used, then <code>DescribeScalingPolicies</code> returns
     *        up to 50 results and a <code>NextToken</code> value, if applicable.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of scaling policy results returned by <code>DescribeScalingPolicies</code> in paginated
     * output. When this parameter is used, <code>DescribeScalingPolicies</code> returns up to <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeScalingPolicies</code> request with the returned
     * <code>NextToken</code> value. This value can be between 1 and 50. If this parameter is not used, then
     * <code>DescribeScalingPolicies</code> returns up to 50 results and a <code>NextToken</code> value, if applicable.
     * </p>
     * 
     * @return The maximum number of scaling policy results returned by <code>DescribeScalingPolicies</code> in
     *         paginated output. When this parameter is used, <code>DescribeScalingPolicies</code> returns up to
     *         <code>MaxResults</code> results in a single page along with a <code>NextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending another
     *         <code>DescribeScalingPolicies</code> request with the returned <code>NextToken</code> value. This value
     *         can be between 1 and 50. If this parameter is not used, then <code>DescribeScalingPolicies</code> returns
     *         up to 50 results and a <code>NextToken</code> value, if applicable.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of scaling policy results returned by <code>DescribeScalingPolicies</code> in paginated
     * output. When this parameter is used, <code>DescribeScalingPolicies</code> returns up to <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another <code>DescribeScalingPolicies</code> request with the returned
     * <code>NextToken</code> value. This value can be between 1 and 50. If this parameter is not used, then
     * <code>DescribeScalingPolicies</code> returns up to 50 results and a <code>NextToken</code> value, if applicable.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of scaling policy results returned by <code>DescribeScalingPolicies</code> in paginated
     *        output. When this parameter is used, <code>DescribeScalingPolicies</code> returns up to
     *        <code>MaxResults</code> results in a single page along with a <code>NextToken</code> response element. The
     *        remaining results of the initial request can be seen by sending another
     *        <code>DescribeScalingPolicies</code> request with the returned <code>NextToken</code> value. This value
     *        can be between 1 and 50. If this parameter is not used, then <code>DescribeScalingPolicies</code> returns
     *        up to 50 results and a <code>NextToken</code> value, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPoliciesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalingPolicies</code> request.
     * Pagination continues from the end of the previous results that returned the <code>NextToken</code> value. This
     * value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalingPolicies</code>
     *        request. Pagination continues from the end of the previous results that returned the
     *        <code>NextToken</code> value. This value is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalingPolicies</code> request.
     * Pagination continues from the end of the previous results that returned the <code>NextToken</code> value. This
     * value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalingPolicies</code>
     *         request. Pagination continues from the end of the previous results that returned the
     *         <code>NextToken</code> value. This value is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalingPolicies</code> request.
     * Pagination continues from the end of the previous results that returned the <code>NextToken</code> value. This
     * value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous paginated <code>DescribeScalingPolicies</code>
     *        request. Pagination continues from the end of the previous results that returned the
     *        <code>NextToken</code> value. This value is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScalingPoliciesRequest withNextToken(String nextToken) {
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
        if (getPolicyNames() != null)
            sb.append("PolicyNames: " + getPolicyNames() + ",");
        if (getServiceNamespace() != null)
            sb.append("ServiceNamespace: " + getServiceNamespace() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
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

        if (obj instanceof DescribeScalingPoliciesRequest == false)
            return false;
        DescribeScalingPoliciesRequest other = (DescribeScalingPoliciesRequest) obj;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false)
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

        hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
        hashCode = prime * hashCode + ((getServiceNamespace() == null) ? 0 : getServiceNamespace().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getScalableDimension() == null) ? 0 : getScalableDimension().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScalingPoliciesRequest clone() {
        return (DescribeScalingPoliciesRequest) super.clone();
    }
}
