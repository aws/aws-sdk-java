/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The proposed access control configuration for a DynamoDB table or index. You can propose a configuration for a new
 * DynamoDB table or index or an existing DynamoDB table or index that you own by specifying the policy for the DynamoDB
 * table or index. For more information, see <a
 * href="https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_PutResourcePolicy.html"
 * >PutResourcePolicy</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If the configuration is for an existing DynamoDB table or index and you do not specify the DynamoDB policy, then the
 * access preview uses the existing DynamoDB policy for the table or index.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the access preview is for a new resource and you do not specify the policy, then the access preview assumes a
 * DynamoDB table without a policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * To propose deletion of an existing DynamoDB table or index policy, you can specify an empty string for the DynamoDB
 * policy.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/DynamodbTableConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DynamodbTableConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The proposed resource policy defining who can access or manage the DynamoDB table.
     * </p>
     */
    private String tablePolicy;

    /**
     * <p>
     * The proposed resource policy defining who can access or manage the DynamoDB table.
     * </p>
     * 
     * @param tablePolicy
     *        The proposed resource policy defining who can access or manage the DynamoDB table.
     */

    public void setTablePolicy(String tablePolicy) {
        this.tablePolicy = tablePolicy;
    }

    /**
     * <p>
     * The proposed resource policy defining who can access or manage the DynamoDB table.
     * </p>
     * 
     * @return The proposed resource policy defining who can access or manage the DynamoDB table.
     */

    public String getTablePolicy() {
        return this.tablePolicy;
    }

    /**
     * <p>
     * The proposed resource policy defining who can access or manage the DynamoDB table.
     * </p>
     * 
     * @param tablePolicy
     *        The proposed resource policy defining who can access or manage the DynamoDB table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamodbTableConfiguration withTablePolicy(String tablePolicy) {
        setTablePolicy(tablePolicy);
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
        if (getTablePolicy() != null)
            sb.append("TablePolicy: ").append(getTablePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DynamodbTableConfiguration == false)
            return false;
        DynamodbTableConfiguration other = (DynamodbTableConfiguration) obj;
        if (other.getTablePolicy() == null ^ this.getTablePolicy() == null)
            return false;
        if (other.getTablePolicy() != null && other.getTablePolicy().equals(this.getTablePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTablePolicy() == null) ? 0 : getTablePolicy().hashCode());
        return hashCode;
    }

    @Override
    public DynamodbTableConfiguration clone() {
        try {
            return (DynamodbTableConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.DynamodbTableConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
