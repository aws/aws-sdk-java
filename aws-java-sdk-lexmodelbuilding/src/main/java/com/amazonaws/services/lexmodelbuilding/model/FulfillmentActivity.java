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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes how the intent is fulfilled after the user provides all of the information required for the intent. You can
 * provide a Lambda function to process the intent, or you can return the intent information to the client application.
 * We recommend that you use a Lambda function so that the relevant logic lives in the Cloud and limit the client-side
 * code primarily to presentation. If you need to update the logic, you only update the Lambda function; you don't need
 * to upgrade your client application.
 * </p>
 * <p>
 * Consider the following examples:
 * </p>
 * <ul>
 * <li>
 * <p>
 * In a pizza ordering application, after the user provides all of the information for placing an order, you use a
 * Lambda function to place an order with a pizzeria.
 * </p>
 * </li>
 * <li>
 * <p>
 * In a gaming application, when a user says "pick up a rock," this information must go back to the client application
 * so that it can perform the operation and update the graphics. In this case, you want Amazon Lex to return the intent
 * data to the client.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/FulfillmentActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FulfillmentActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to the
     * client application.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A description of the Lambda function that is run to fulfill the intent.
     * </p>
     */
    private CodeHook codeHook;

    /**
     * <p>
     * How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to the
     * client application.
     * </p>
     * 
     * @param type
     *        How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to
     *        the client application.
     * @see FulfillmentActivityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to the
     * client application.
     * </p>
     * 
     * @return How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to
     *         the client application.
     * @see FulfillmentActivityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to the
     * client application.
     * </p>
     * 
     * @param type
     *        How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to
     *        the client application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FulfillmentActivityType
     */

    public FulfillmentActivity withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to the
     * client application.
     * </p>
     * 
     * @param type
     *        How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to
     *        the client application.
     * @see FulfillmentActivityType
     */

    public void setType(FulfillmentActivityType type) {
        withType(type);
    }

    /**
     * <p>
     * How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to the
     * client application.
     * </p>
     * 
     * @param type
     *        How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to
     *        the client application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FulfillmentActivityType
     */

    public FulfillmentActivity withType(FulfillmentActivityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A description of the Lambda function that is run to fulfill the intent.
     * </p>
     * 
     * @param codeHook
     *        A description of the Lambda function that is run to fulfill the intent.
     */

    public void setCodeHook(CodeHook codeHook) {
        this.codeHook = codeHook;
    }

    /**
     * <p>
     * A description of the Lambda function that is run to fulfill the intent.
     * </p>
     * 
     * @return A description of the Lambda function that is run to fulfill the intent.
     */

    public CodeHook getCodeHook() {
        return this.codeHook;
    }

    /**
     * <p>
     * A description of the Lambda function that is run to fulfill the intent.
     * </p>
     * 
     * @param codeHook
     *        A description of the Lambda function that is run to fulfill the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FulfillmentActivity withCodeHook(CodeHook codeHook) {
        setCodeHook(codeHook);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCodeHook() != null)
            sb.append("CodeHook: ").append(getCodeHook());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FulfillmentActivity == false)
            return false;
        FulfillmentActivity other = (FulfillmentActivity) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCodeHook() == null ^ this.getCodeHook() == null)
            return false;
        if (other.getCodeHook() != null && other.getCodeHook().equals(this.getCodeHook()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCodeHook() == null) ? 0 : getCodeHook().hashCode());
        return hashCode;
    }

    @Override
    public FulfillmentActivity clone() {
        try {
            return (FulfillmentActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.FulfillmentActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
