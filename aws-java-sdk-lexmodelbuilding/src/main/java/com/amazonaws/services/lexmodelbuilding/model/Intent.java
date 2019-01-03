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
 * Identifies the specific version of an intent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/Intent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Intent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the intent.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * The version of the intent.
     * </p>
     */
    private String intentVersion;

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @param intentName
     *        The name of the intent.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @return The name of the intent.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @param intentName
     *        The name of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Intent withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * The version of the intent.
     * </p>
     * 
     * @param intentVersion
     *        The version of the intent.
     */

    public void setIntentVersion(String intentVersion) {
        this.intentVersion = intentVersion;
    }

    /**
     * <p>
     * The version of the intent.
     * </p>
     * 
     * @return The version of the intent.
     */

    public String getIntentVersion() {
        return this.intentVersion;
    }

    /**
     * <p>
     * The version of the intent.
     * </p>
     * 
     * @param intentVersion
     *        The version of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Intent withIntentVersion(String intentVersion) {
        setIntentVersion(intentVersion);
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
        if (getIntentName() != null)
            sb.append("IntentName: ").append(getIntentName()).append(",");
        if (getIntentVersion() != null)
            sb.append("IntentVersion: ").append(getIntentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Intent == false)
            return false;
        Intent other = (Intent) obj;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getIntentVersion() == null ^ this.getIntentVersion() == null)
            return false;
        if (other.getIntentVersion() != null && other.getIntentVersion().equals(this.getIntentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getIntentVersion() == null) ? 0 : getIntentVersion().hashCode());
        return hashCode;
    }

    @Override
    public Intent clone() {
        try {
            return (Intent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.IntentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
