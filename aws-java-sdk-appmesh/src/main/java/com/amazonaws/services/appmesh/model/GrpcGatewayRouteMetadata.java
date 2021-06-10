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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the metadata of the gateway route.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/GrpcGatewayRouteMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrpcGatewayRouteMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify <code>True</code> to match anything except the match criteria. The default value is <code>False</code>.
     * </p>
     */
    private Boolean invert;
    /**
     * <p>
     * The criteria for determining a metadata match.
     * </p>
     */
    private GrpcMetadataMatchMethod match;
    /**
     * <p>
     * A name for the gateway route metadata.
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

    public GrpcGatewayRouteMetadata withInvert(Boolean invert) {
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
     * The criteria for determining a metadata match.
     * </p>
     * 
     * @param match
     *        The criteria for determining a metadata match.
     */

    public void setMatch(GrpcMetadataMatchMethod match) {
        this.match = match;
    }

    /**
     * <p>
     * The criteria for determining a metadata match.
     * </p>
     * 
     * @return The criteria for determining a metadata match.
     */

    public GrpcMetadataMatchMethod getMatch() {
        return this.match;
    }

    /**
     * <p>
     * The criteria for determining a metadata match.
     * </p>
     * 
     * @param match
     *        The criteria for determining a metadata match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcGatewayRouteMetadata withMatch(GrpcMetadataMatchMethod match) {
        setMatch(match);
        return this;
    }

    /**
     * <p>
     * A name for the gateway route metadata.
     * </p>
     * 
     * @param name
     *        A name for the gateway route metadata.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the gateway route metadata.
     * </p>
     * 
     * @return A name for the gateway route metadata.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the gateway route metadata.
     * </p>
     * 
     * @param name
     *        A name for the gateway route metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcGatewayRouteMetadata withName(String name) {
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

        if (obj instanceof GrpcGatewayRouteMetadata == false)
            return false;
        GrpcGatewayRouteMetadata other = (GrpcGatewayRouteMetadata) obj;
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
    public GrpcGatewayRouteMetadata clone() {
        try {
            return (GrpcGatewayRouteMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.GrpcGatewayRouteMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
