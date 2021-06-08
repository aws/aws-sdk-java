/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure returned by the <a>ListGroupResources</a> operation that contains identity and group membership status
 * information for one of the resources in the group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/ListGroupResourcesItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGroupResourcesItem implements Serializable, Cloneable, StructuredPojo {

    private ResourceIdentifier identifier;
    /**
     * <p>
     * A structure that contains the status of this resource's membership in the group.
     * </p>
     * <note>
     * <p>
     * This field is present in the response only if the group is of type <code>AWS::EC2::HostManagement</code>.
     * </p>
     * </note>
     */
    private ResourceStatus status;

    /**
     * @param identifier
     */

    public void setIdentifier(ResourceIdentifier identifier) {
        this.identifier = identifier;
    }

    /**
     * @return
     */

    public ResourceIdentifier getIdentifier() {
        return this.identifier;
    }

    /**
     * @param identifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupResourcesItem withIdentifier(ResourceIdentifier identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * A structure that contains the status of this resource's membership in the group.
     * </p>
     * <note>
     * <p>
     * This field is present in the response only if the group is of type <code>AWS::EC2::HostManagement</code>.
     * </p>
     * </note>
     * 
     * @param status
     *        A structure that contains the status of this resource's membership in the group.</p> <note>
     *        <p>
     *        This field is present in the response only if the group is of type <code>AWS::EC2::HostManagement</code>.
     *        </p>
     */

    public void setStatus(ResourceStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * A structure that contains the status of this resource's membership in the group.
     * </p>
     * <note>
     * <p>
     * This field is present in the response only if the group is of type <code>AWS::EC2::HostManagement</code>.
     * </p>
     * </note>
     * 
     * @return A structure that contains the status of this resource's membership in the group.</p> <note>
     *         <p>
     *         This field is present in the response only if the group is of type <code>AWS::EC2::HostManagement</code>.
     *         </p>
     */

    public ResourceStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A structure that contains the status of this resource's membership in the group.
     * </p>
     * <note>
     * <p>
     * This field is present in the response only if the group is of type <code>AWS::EC2::HostManagement</code>.
     * </p>
     * </note>
     * 
     * @param status
     *        A structure that contains the status of this resource's membership in the group.</p> <note>
     *        <p>
     *        This field is present in the response only if the group is of type <code>AWS::EC2::HostManagement</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGroupResourcesItem withStatus(ResourceStatus status) {
        setStatus(status);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGroupResourcesItem == false)
            return false;
        ListGroupResourcesItem other = (ListGroupResourcesItem) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ListGroupResourcesItem clone() {
        try {
            return (ListGroupResourcesItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroups.model.transform.ListGroupResourcesItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
