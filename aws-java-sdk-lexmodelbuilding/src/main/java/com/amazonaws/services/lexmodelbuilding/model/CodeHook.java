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
 * Specifies a Lambda function that verifies requests to a bot or fulfills the user's request to a bot..
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/CodeHook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeHook implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function. For more
     * information, see <a>using-lambda</a>.
     * </p>
     */
    private String messageVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     * 
     * @param uri
     *        The Amazon Resource Name (ARN) of the Lambda function.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lambda function.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function.
     * </p>
     * 
     * @param uri
     *        The Amazon Resource Name (ARN) of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeHook withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function. For more
     * information, see <a>using-lambda</a>.
     * </p>
     * 
     * @param messageVersion
     *        The version of the request-response that you want Amazon Lex to use to invoke your Lambda function. For
     *        more information, see <a>using-lambda</a>.
     */

    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    /**
     * <p>
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function. For more
     * information, see <a>using-lambda</a>.
     * </p>
     * 
     * @return The version of the request-response that you want Amazon Lex to use to invoke your Lambda function. For
     *         more information, see <a>using-lambda</a>.
     */

    public String getMessageVersion() {
        return this.messageVersion;
    }

    /**
     * <p>
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function. For more
     * information, see <a>using-lambda</a>.
     * </p>
     * 
     * @param messageVersion
     *        The version of the request-response that you want Amazon Lex to use to invoke your Lambda function. For
     *        more information, see <a>using-lambda</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeHook withMessageVersion(String messageVersion) {
        setMessageVersion(messageVersion);
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
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getMessageVersion() != null)
            sb.append("MessageVersion: ").append(getMessageVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeHook == false)
            return false;
        CodeHook other = (CodeHook) obj;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getMessageVersion() == null ^ this.getMessageVersion() == null)
            return false;
        if (other.getMessageVersion() != null && other.getMessageVersion().equals(this.getMessageVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getMessageVersion() == null) ? 0 : getMessageVersion().hashCode());
        return hashCode;
    }

    @Override
    public CodeHook clone() {
        try {
            return (CodeHook) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.CodeHookMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
