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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the use case.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UseCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UseCase implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the use case.
     * </p>
     */
    private String useCaseId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the use case.
     * </p>
     */
    private String useCaseArn;
    /**
     * <p>
     * The type of use case to associate to the AppIntegration association. Each AppIntegration association can have
     * only one of each use case type.
     * </p>
     */
    private String useCaseType;

    /**
     * <p>
     * The identifier for the use case.
     * </p>
     * 
     * @param useCaseId
     *        The identifier for the use case.
     */

    public void setUseCaseId(String useCaseId) {
        this.useCaseId = useCaseId;
    }

    /**
     * <p>
     * The identifier for the use case.
     * </p>
     * 
     * @return The identifier for the use case.
     */

    public String getUseCaseId() {
        return this.useCaseId;
    }

    /**
     * <p>
     * The identifier for the use case.
     * </p>
     * 
     * @param useCaseId
     *        The identifier for the use case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UseCase withUseCaseId(String useCaseId) {
        setUseCaseId(useCaseId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the use case.
     * </p>
     * 
     * @param useCaseArn
     *        The Amazon Resource Name (ARN) for the use case.
     */

    public void setUseCaseArn(String useCaseArn) {
        this.useCaseArn = useCaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the use case.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the use case.
     */

    public String getUseCaseArn() {
        return this.useCaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the use case.
     * </p>
     * 
     * @param useCaseArn
     *        The Amazon Resource Name (ARN) for the use case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UseCase withUseCaseArn(String useCaseArn) {
        setUseCaseArn(useCaseArn);
        return this;
    }

    /**
     * <p>
     * The type of use case to associate to the AppIntegration association. Each AppIntegration association can have
     * only one of each use case type.
     * </p>
     * 
     * @param useCaseType
     *        The type of use case to associate to the AppIntegration association. Each AppIntegration association can
     *        have only one of each use case type.
     * @see UseCaseType
     */

    public void setUseCaseType(String useCaseType) {
        this.useCaseType = useCaseType;
    }

    /**
     * <p>
     * The type of use case to associate to the AppIntegration association. Each AppIntegration association can have
     * only one of each use case type.
     * </p>
     * 
     * @return The type of use case to associate to the AppIntegration association. Each AppIntegration association can
     *         have only one of each use case type.
     * @see UseCaseType
     */

    public String getUseCaseType() {
        return this.useCaseType;
    }

    /**
     * <p>
     * The type of use case to associate to the AppIntegration association. Each AppIntegration association can have
     * only one of each use case type.
     * </p>
     * 
     * @param useCaseType
     *        The type of use case to associate to the AppIntegration association. Each AppIntegration association can
     *        have only one of each use case type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UseCaseType
     */

    public UseCase withUseCaseType(String useCaseType) {
        setUseCaseType(useCaseType);
        return this;
    }

    /**
     * <p>
     * The type of use case to associate to the AppIntegration association. Each AppIntegration association can have
     * only one of each use case type.
     * </p>
     * 
     * @param useCaseType
     *        The type of use case to associate to the AppIntegration association. Each AppIntegration association can
     *        have only one of each use case type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UseCaseType
     */

    public UseCase withUseCaseType(UseCaseType useCaseType) {
        this.useCaseType = useCaseType.toString();
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
        if (getUseCaseId() != null)
            sb.append("UseCaseId: ").append(getUseCaseId()).append(",");
        if (getUseCaseArn() != null)
            sb.append("UseCaseArn: ").append(getUseCaseArn()).append(",");
        if (getUseCaseType() != null)
            sb.append("UseCaseType: ").append(getUseCaseType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UseCase == false)
            return false;
        UseCase other = (UseCase) obj;
        if (other.getUseCaseId() == null ^ this.getUseCaseId() == null)
            return false;
        if (other.getUseCaseId() != null && other.getUseCaseId().equals(this.getUseCaseId()) == false)
            return false;
        if (other.getUseCaseArn() == null ^ this.getUseCaseArn() == null)
            return false;
        if (other.getUseCaseArn() != null && other.getUseCaseArn().equals(this.getUseCaseArn()) == false)
            return false;
        if (other.getUseCaseType() == null ^ this.getUseCaseType() == null)
            return false;
        if (other.getUseCaseType() != null && other.getUseCaseType().equals(this.getUseCaseType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUseCaseId() == null) ? 0 : getUseCaseId().hashCode());
        hashCode = prime * hashCode + ((getUseCaseArn() == null) ? 0 : getUseCaseArn().hashCode());
        hashCode = prime * hashCode + ((getUseCaseType() == null) ? 0 : getUseCaseType().hashCode());
        return hashCode;
    }

    @Override
    public UseCase clone() {
        try {
            return (UseCase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.UseCaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
