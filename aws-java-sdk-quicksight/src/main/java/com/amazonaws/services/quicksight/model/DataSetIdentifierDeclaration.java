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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A data set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataSetIdentifierDeclaration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSetIdentifierDeclaration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the data set, typically the data set's name.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data set.
     * </p>
     */
    private String dataSetArn;

    /**
     * <p>
     * The identifier of the data set, typically the data set's name.
     * </p>
     * 
     * @param identifier
     *        The identifier of the data set, typically the data set's name.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the data set, typically the data set's name.
     * </p>
     * 
     * @return The identifier of the data set, typically the data set's name.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the data set, typically the data set's name.
     * </p>
     * 
     * @param identifier
     *        The identifier of the data set, typically the data set's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetIdentifierDeclaration withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data set.
     * </p>
     * 
     * @param dataSetArn
     *        The Amazon Resource Name (ARN) of the data set.
     */

    public void setDataSetArn(String dataSetArn) {
        this.dataSetArn = dataSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the data set.
     */

    public String getDataSetArn() {
        return this.dataSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data set.
     * </p>
     * 
     * @param dataSetArn
     *        The Amazon Resource Name (ARN) of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSetIdentifierDeclaration withDataSetArn(String dataSetArn) {
        setDataSetArn(dataSetArn);
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
        if (getDataSetArn() != null)
            sb.append("DataSetArn: ").append(getDataSetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSetIdentifierDeclaration == false)
            return false;
        DataSetIdentifierDeclaration other = (DataSetIdentifierDeclaration) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getDataSetArn() == null ^ this.getDataSetArn() == null)
            return false;
        if (other.getDataSetArn() != null && other.getDataSetArn().equals(this.getDataSetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDataSetArn() == null) ? 0 : getDataSetArn().hashCode());
        return hashCode;
    }

    @Override
    public DataSetIdentifierDeclaration clone() {
        try {
            return (DataSetIdentifierDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataSetIdentifierDeclarationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
