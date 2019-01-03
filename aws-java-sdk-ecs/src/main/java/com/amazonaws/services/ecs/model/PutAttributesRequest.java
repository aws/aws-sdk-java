/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/PutAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that contains the resource to apply attributes.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The attributes to apply to your resource. You can specify up to 10 custom attributes per resource. You can
     * specify up to 10 attributes in a single call.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Attribute> attributes;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that contains the resource to apply attributes.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that contains the resource to apply
     *        attributes. If you do not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that contains the resource to apply attributes.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that contains the resource to apply
     *         attributes. If you do not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster that contains the resource to apply attributes.
     * If you do not specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster that contains the resource to apply
     *        attributes. If you do not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAttributesRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The attributes to apply to your resource. You can specify up to 10 custom attributes per resource. You can
     * specify up to 10 attributes in a single call.
     * </p>
     * 
     * @return The attributes to apply to your resource. You can specify up to 10 custom attributes per resource. You
     *         can specify up to 10 attributes in a single call.
     */

    public java.util.List<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalList<Attribute>();
        }
        return attributes;
    }

    /**
     * <p>
     * The attributes to apply to your resource. You can specify up to 10 custom attributes per resource. You can
     * specify up to 10 attributes in a single call.
     * </p>
     * 
     * @param attributes
     *        The attributes to apply to your resource. You can specify up to 10 custom attributes per resource. You can
     *        specify up to 10 attributes in a single call.
     */

    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new com.amazonaws.internal.SdkInternalList<Attribute>(attributes);
    }

    /**
     * <p>
     * The attributes to apply to your resource. You can specify up to 10 custom attributes per resource. You can
     * specify up to 10 attributes in a single call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The attributes to apply to your resource. You can specify up to 10 custom attributes per resource. You can
     *        specify up to 10 attributes in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAttributesRequest withAttributes(Attribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new com.amazonaws.internal.SdkInternalList<Attribute>(attributes.length));
        }
        for (Attribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes to apply to your resource. You can specify up to 10 custom attributes per resource. You can
     * specify up to 10 attributes in a single call.
     * </p>
     * 
     * @param attributes
     *        The attributes to apply to your resource. You can specify up to 10 custom attributes per resource. You can
     *        specify up to 10 attributes in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAttributesRequest withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAttributesRequest == false)
            return false;
        PutAttributesRequest other = (PutAttributesRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public PutAttributesRequest clone() {
        return (PutAttributesRequest) super.clone();
    }

}
