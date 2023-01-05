/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateRoute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRouteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application in which the route is created.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the route. The format for this ARN is
     * <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Web Services account ID of the route creator.
     * </p>
     */
    private String createdByAccountId;
    /**
     * <p>
     * A timestamp that indicates when the route is created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * A timestamp that indicates when the route was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The Amazon Web Services account ID of the route owner.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * The unique identifier of the route.
     * </p>
     */
    private String routeId;
    /**
     * <p>
     * The route type of the route.
     * </p>
     */
    private String routeType;
    /**
     * <p>
     * The ID of service in which the route is created. Traffic that matches this route is forwarded to this service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The current state of the route. Activation state only allows <code>ACTIVE</code> or <code>INACTIVE</code> as user
     * inputs. <code>FAILED</code> is a route state that is system generated.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags assigned to the created route. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Configuration for the URI path route type.
     * </p>
     */
    private UriPathRouteInput uriPathRoute;

    /**
     * <p>
     * The ID of the application in which the route is created.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application in which the route is created.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application in which the route is created.
     * </p>
     * 
     * @return The ID of the application in which the route is created.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application in which the route is created.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application in which the route is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the route. The format for this ARN is
     * <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the route. The format for this ARN is
     *        <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>.
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the route. The format for this ARN is
     * <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the route. The format for this ARN is
     *         <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>.
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the route. The format for this ARN is
     * <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>. For more
     * information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">
     * Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the route. The format for this ARN is
     *        <code>arn:aws:refactor-spaces:<i>region</i>:<i>account-id</i>:<i>resource-type/resource-id</i> </code>.
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the route creator.
     * </p>
     * 
     * @param createdByAccountId
     *        The Amazon Web Services account ID of the route creator.
     */

    public void setCreatedByAccountId(String createdByAccountId) {
        this.createdByAccountId = createdByAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the route creator.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the route creator.
     */

    public String getCreatedByAccountId() {
        return this.createdByAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the route creator.
     * </p>
     * 
     * @param createdByAccountId
     *        The Amazon Web Services account ID of the route creator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResult withCreatedByAccountId(String createdByAccountId) {
        setCreatedByAccountId(createdByAccountId);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the route is created.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that indicates when the route is created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the route is created.
     * </p>
     * 
     * @return A timestamp that indicates when the route is created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the route is created.
     * </p>
     * 
     * @param createdTime
     *        A timestamp that indicates when the route is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the route was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the route was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the route was last updated.
     * </p>
     * 
     * @return A timestamp that indicates when the route was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the route was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        A timestamp that indicates when the route was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the route owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The Amazon Web Services account ID of the route owner.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the route owner.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the route owner.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the route owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The Amazon Web Services account ID of the route owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResult withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the route.
     * </p>
     * 
     * @param routeId
     *        The unique identifier of the route.
     */

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * <p>
     * The unique identifier of the route.
     * </p>
     * 
     * @return The unique identifier of the route.
     */

    public String getRouteId() {
        return this.routeId;
    }

    /**
     * <p>
     * The unique identifier of the route.
     * </p>
     * 
     * @param routeId
     *        The unique identifier of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResult withRouteId(String routeId) {
        setRouteId(routeId);
        return this;
    }

    /**
     * <p>
     * The route type of the route.
     * </p>
     * 
     * @param routeType
     *        The route type of the route.
     * @see RouteType
     */

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    /**
     * <p>
     * The route type of the route.
     * </p>
     * 
     * @return The route type of the route.
     * @see RouteType
     */

    public String getRouteType() {
        return this.routeType;
    }

    /**
     * <p>
     * The route type of the route.
     * </p>
     * 
     * @param routeType
     *        The route type of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteType
     */

    public CreateRouteResult withRouteType(String routeType) {
        setRouteType(routeType);
        return this;
    }

    /**
     * <p>
     * The route type of the route.
     * </p>
     * 
     * @param routeType
     *        The route type of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteType
     */

    public CreateRouteResult withRouteType(RouteType routeType) {
        this.routeType = routeType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of service in which the route is created. Traffic that matches this route is forwarded to this service.
     * </p>
     * 
     * @param serviceId
     *        The ID of service in which the route is created. Traffic that matches this route is forwarded to this
     *        service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of service in which the route is created. Traffic that matches this route is forwarded to this service.
     * </p>
     * 
     * @return The ID of service in which the route is created. Traffic that matches this route is forwarded to this
     *         service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of service in which the route is created. Traffic that matches this route is forwarded to this service.
     * </p>
     * 
     * @param serviceId
     *        The ID of service in which the route is created. Traffic that matches this route is forwarded to this
     *        service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResult withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The current state of the route. Activation state only allows <code>ACTIVE</code> or <code>INACTIVE</code> as user
     * inputs. <code>FAILED</code> is a route state that is system generated.
     * </p>
     * 
     * @param state
     *        The current state of the route. Activation state only allows <code>ACTIVE</code> or <code>INACTIVE</code>
     *        as user inputs. <code>FAILED</code> is a route state that is system generated.
     * @see RouteState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the route. Activation state only allows <code>ACTIVE</code> or <code>INACTIVE</code> as user
     * inputs. <code>FAILED</code> is a route state that is system generated.
     * </p>
     * 
     * @return The current state of the route. Activation state only allows <code>ACTIVE</code> or <code>INACTIVE</code>
     *         as user inputs. <code>FAILED</code> is a route state that is system generated.
     * @see RouteState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the route. Activation state only allows <code>ACTIVE</code> or <code>INACTIVE</code> as user
     * inputs. <code>FAILED</code> is a route state that is system generated.
     * </p>
     * 
     * @param state
     *        The current state of the route. Activation state only allows <code>ACTIVE</code> or <code>INACTIVE</code>
     *        as user inputs. <code>FAILED</code> is a route state that is system generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteState
     */

    public CreateRouteResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the route. Activation state only allows <code>ACTIVE</code> or <code>INACTIVE</code> as user
     * inputs. <code>FAILED</code> is a route state that is system generated.
     * </p>
     * 
     * @param state
     *        The current state of the route. Activation state only allows <code>ACTIVE</code> or <code>INACTIVE</code>
     *        as user inputs. <code>FAILED</code> is a route state that is system generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteState
     */

    public CreateRouteResult withState(RouteState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags assigned to the created route. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @return The tags assigned to the created route. A tag is a label that you assign to an Amazon Web Services
     *         resource. Each tag consists of a key-value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the created route. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the created route. A tag is a label that you assign to an Amazon Web Services
     *        resource. Each tag consists of a key-value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the created route. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the created route. A tag is a label that you assign to an Amazon Web Services
     *        resource. Each tag consists of a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRouteResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Configuration for the URI path route type.
     * </p>
     * 
     * @param uriPathRoute
     *        Configuration for the URI path route type.
     */

    public void setUriPathRoute(UriPathRouteInput uriPathRoute) {
        this.uriPathRoute = uriPathRoute;
    }

    /**
     * <p>
     * Configuration for the URI path route type.
     * </p>
     * 
     * @return Configuration for the URI path route type.
     */

    public UriPathRouteInput getUriPathRoute() {
        return this.uriPathRoute;
    }

    /**
     * <p>
     * Configuration for the URI path route type.
     * </p>
     * 
     * @param uriPathRoute
     *        Configuration for the URI path route type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRouteResult withUriPathRoute(UriPathRouteInput uriPathRoute) {
        setUriPathRoute(uriPathRoute);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedByAccountId() != null)
            sb.append("CreatedByAccountId: ").append(getCreatedByAccountId()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getRouteId() != null)
            sb.append("RouteId: ").append(getRouteId()).append(",");
        if (getRouteType() != null)
            sb.append("RouteType: ").append(getRouteType()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getUriPathRoute() != null)
            sb.append("UriPathRoute: ").append(getUriPathRoute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRouteResult == false)
            return false;
        CreateRouteResult other = (CreateRouteResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedByAccountId() == null ^ this.getCreatedByAccountId() == null)
            return false;
        if (other.getCreatedByAccountId() != null && other.getCreatedByAccountId().equals(this.getCreatedByAccountId()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getRouteId() == null ^ this.getRouteId() == null)
            return false;
        if (other.getRouteId() != null && other.getRouteId().equals(this.getRouteId()) == false)
            return false;
        if (other.getRouteType() == null ^ this.getRouteType() == null)
            return false;
        if (other.getRouteType() != null && other.getRouteType().equals(this.getRouteType()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUriPathRoute() == null ^ this.getUriPathRoute() == null)
            return false;
        if (other.getUriPathRoute() != null && other.getUriPathRoute().equals(this.getUriPathRoute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedByAccountId() == null) ? 0 : getCreatedByAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getRouteId() == null) ? 0 : getRouteId().hashCode());
        hashCode = prime * hashCode + ((getRouteType() == null) ? 0 : getRouteType().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUriPathRoute() == null) ? 0 : getUriPathRoute().hashCode());
        return hashCode;
    }

    @Override
    public CreateRouteResult clone() {
        try {
            return (CreateRouteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
