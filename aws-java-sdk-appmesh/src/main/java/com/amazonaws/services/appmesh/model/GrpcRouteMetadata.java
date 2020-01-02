/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the match metadata for the route.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/GrpcRouteMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrpcRouteMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify <code>True</code> to match anything except the match criteria. The default value is <code>False</code>.
     * </p>
     */
    private Boolean invert;
    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     */
    private GrpcRouteMetadataMatchMethod match;
    /**
     * <p>
     * The name of the route.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Specify <code>True</code> to match anything except the match criteria. The default value is <code>False</code>.
     * </p>
     * 
     * @param invert
     *        Specify <code>True</code> to match anything except the match criteria. The default value is
     *        <code>False</code>.
     */

    public void setInvert(Boolean invert) {
        this.invert = invert;
    }

    /**
     * <p>
     * Specify <code>True</code> to match anything except the match criteria. The default value is <code>False</code>.
     * </p>
     * 
     * @return Specify <code>True</code> to match anything except the match criteria. The default value is
     *         <code>False</code>.
     */

    public Boolean getInvert() {
        return this.invert;
    }

    /**
     * <p>
     * Specify <code>True</code> to match anything except the match criteria. The default value is <code>False</code>.
     * </p>
     * 
     * @param invert
     *        Specify <code>True</code> to match anything except the match criteria. The default value is
     *        <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcRouteMetadata withInvert(Boolean invert) {
        setInvert(invert);
        return this;
    }

    /**
     * <p>
     * Specify <code>True</code> to match anything except the match criteria. The default value is <code>False</code>.
     * </p>
     * 
     * @return Specify <code>True</code> to match anything except the match criteria. The default value is
     *         <code>False</code>.
     */

    public Boolean isInvert() {
        return this.invert;
    }

    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     * 
     * @param match
     *        An object that represents the data to match from the request.
     */

    public void setMatch(GrpcRouteMetadataMatchMethod match) {
        this.match = match;
    }

    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     * 
     * @return An object that represents the data to match from the request.
     */

    public GrpcRouteMetadataMatchMethod getMatch() {
        return this.match;
    }

    /**
     * <p>
     * An object that represents the data to match from the request.
     * </p>
     * 
     * @param match
     *        An object that represents the data to match from the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcRouteMetadata withMatch(GrpcRouteMetadataMatchMethod match) {
        setMatch(match);
        return this;
    }

    /**
     * <p>
     * The name of the route.
     * </p>
     * 
     * @param name
     *        The name of the route.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the route.
     * </p>
     * 
     * @return The name of the route.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the route.
     * </p>
     * 
     * @param name
     *        The name of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcRouteMetadata withName(String name) {
        setName(name);
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
        if (getInvert() != null)
            sb.append("Invert: ").append(getInvert()).append(",");
        if (getMatch() != null)
            sb.append("Match: ").append(getMatch()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrpcRouteMetadata == false)
            return false;
        GrpcRouteMetadata other = (GrpcRouteMetadata) obj;
        if (other.getInvert() == null ^ this.getInvert() == null)
            return false;
        if (other.getInvert() != null && other.getInvert().equals(this.getInvert()) == false)
            return false;
        if (other.getMatch() == null ^ this.getMatch() == null)
            return false;
        if (other.getMatch() != null && other.getMatch().equals(this.getMatch()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvert() == null) ? 0 : getInvert().hashCode());
        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public GrpcRouteMetadata clone() {
        try {
            return (GrpcRouteMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.GrpcRouteMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
