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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a physical resource identifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/PhysicalResourceId" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhysicalResourceId implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account that owns the physical resource.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The Amazon Web Services Region that the physical resource is located in.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * The identifier of the physical resource.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Specifies the type of physical resource identifier.
     * </p>
     * <dl>
     * <dt>Arn</dt>
     * <dd>
     * <p>
     * The resource identifier is an Amazon Resource Name (ARN) .
     * </p>
     * </dd>
     * <dt>Native</dt>
     * <dd>
     * <p>
     * The resource identifier is a Resilience Hub-native identifier.
     * </p>
     * </dd>
     * </dl>
     */
    private String type;

    /**
     * <p>
     * The Amazon Web Services account that owns the physical resource.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account that owns the physical resource.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns the physical resource.
     * </p>
     * 
     * @return The Amazon Web Services account that owns the physical resource.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns the physical resource.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account that owns the physical resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResourceId withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region that the physical resource is located in.
     * </p>
     * 
     * @param awsRegion
     *        The Amazon Web Services Region that the physical resource is located in.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region that the physical resource is located in.
     * </p>
     * 
     * @return The Amazon Web Services Region that the physical resource is located in.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region that the physical resource is located in.
     * </p>
     * 
     * @param awsRegion
     *        The Amazon Web Services Region that the physical resource is located in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResourceId withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * The identifier of the physical resource.
     * </p>
     * 
     * @param identifier
     *        The identifier of the physical resource.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the physical resource.
     * </p>
     * 
     * @return The identifier of the physical resource.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the physical resource.
     * </p>
     * 
     * @param identifier
     *        The identifier of the physical resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalResourceId withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Specifies the type of physical resource identifier.
     * </p>
     * <dl>
     * <dt>Arn</dt>
     * <dd>
     * <p>
     * The resource identifier is an Amazon Resource Name (ARN) .
     * </p>
     * </dd>
     * <dt>Native</dt>
     * <dd>
     * <p>
     * The resource identifier is a Resilience Hub-native identifier.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param type
     *        Specifies the type of physical resource identifier.</p>
     *        <dl>
     *        <dt>Arn</dt>
     *        <dd>
     *        <p>
     *        The resource identifier is an Amazon Resource Name (ARN) .
     *        </p>
     *        </dd>
     *        <dt>Native</dt>
     *        <dd>
     *        <p>
     *        The resource identifier is a Resilience Hub-native identifier.
     *        </p>
     *        </dd>
     * @see PhysicalIdentifierType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of physical resource identifier.
     * </p>
     * <dl>
     * <dt>Arn</dt>
     * <dd>
     * <p>
     * The resource identifier is an Amazon Resource Name (ARN) .
     * </p>
     * </dd>
     * <dt>Native</dt>
     * <dd>
     * <p>
     * The resource identifier is a Resilience Hub-native identifier.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Specifies the type of physical resource identifier.</p>
     *         <dl>
     *         <dt>Arn</dt>
     *         <dd>
     *         <p>
     *         The resource identifier is an Amazon Resource Name (ARN) .
     *         </p>
     *         </dd>
     *         <dt>Native</dt>
     *         <dd>
     *         <p>
     *         The resource identifier is a Resilience Hub-native identifier.
     *         </p>
     *         </dd>
     * @see PhysicalIdentifierType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the type of physical resource identifier.
     * </p>
     * <dl>
     * <dt>Arn</dt>
     * <dd>
     * <p>
     * The resource identifier is an Amazon Resource Name (ARN) .
     * </p>
     * </dd>
     * <dt>Native</dt>
     * <dd>
     * <p>
     * The resource identifier is a Resilience Hub-native identifier.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param type
     *        Specifies the type of physical resource identifier.</p>
     *        <dl>
     *        <dt>Arn</dt>
     *        <dd>
     *        <p>
     *        The resource identifier is an Amazon Resource Name (ARN) .
     *        </p>
     *        </dd>
     *        <dt>Native</dt>
     *        <dd>
     *        <p>
     *        The resource identifier is a Resilience Hub-native identifier.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhysicalIdentifierType
     */

    public PhysicalResourceId withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the type of physical resource identifier.
     * </p>
     * <dl>
     * <dt>Arn</dt>
     * <dd>
     * <p>
     * The resource identifier is an Amazon Resource Name (ARN) .
     * </p>
     * </dd>
     * <dt>Native</dt>
     * <dd>
     * <p>
     * The resource identifier is a Resilience Hub-native identifier.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param type
     *        Specifies the type of physical resource identifier.</p>
     *        <dl>
     *        <dt>Arn</dt>
     *        <dd>
     *        <p>
     *        The resource identifier is an Amazon Resource Name (ARN) .
     *        </p>
     *        </dd>
     *        <dt>Native</dt>
     *        <dd>
     *        <p>
     *        The resource identifier is a Resilience Hub-native identifier.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhysicalIdentifierType
     */

    public PhysicalResourceId withType(PhysicalIdentifierType type) {
        this.type = type.toString();
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhysicalResourceId == false)
            return false;
        PhysicalResourceId other = (PhysicalResourceId) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public PhysicalResourceId clone() {
        try {
            return (PhysicalResourceId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.PhysicalResourceIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
