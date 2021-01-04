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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains the options specified by the sumitter of the import request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/ImportOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Options relating to the destination of the import request.
     * </p>
     */
    private DestinationOptions destinationOptions;
    /**
     * <p>
     * Options relating to parsing delimited text. Required if dataFormat is DELIMITED_TEXT.
     * </p>
     */
    private DelimitedTextImportOptions delimitedTextOptions;

    /**
     * <p>
     * Options relating to the destination of the import request.
     * </p>
     * 
     * @param destinationOptions
     *        Options relating to the destination of the import request.
     */

    public void setDestinationOptions(DestinationOptions destinationOptions) {
        this.destinationOptions = destinationOptions;
    }

    /**
     * <p>
     * Options relating to the destination of the import request.
     * </p>
     * 
     * @return Options relating to the destination of the import request.
     */

    public DestinationOptions getDestinationOptions() {
        return this.destinationOptions;
    }

    /**
     * <p>
     * Options relating to the destination of the import request.
     * </p>
     * 
     * @param destinationOptions
     *        Options relating to the destination of the import request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportOptions withDestinationOptions(DestinationOptions destinationOptions) {
        setDestinationOptions(destinationOptions);
        return this;
    }

    /**
     * <p>
     * Options relating to parsing delimited text. Required if dataFormat is DELIMITED_TEXT.
     * </p>
     * 
     * @param delimitedTextOptions
     *        Options relating to parsing delimited text. Required if dataFormat is DELIMITED_TEXT.
     */

    public void setDelimitedTextOptions(DelimitedTextImportOptions delimitedTextOptions) {
        this.delimitedTextOptions = delimitedTextOptions;
    }

    /**
     * <p>
     * Options relating to parsing delimited text. Required if dataFormat is DELIMITED_TEXT.
     * </p>
     * 
     * @return Options relating to parsing delimited text. Required if dataFormat is DELIMITED_TEXT.
     */

    public DelimitedTextImportOptions getDelimitedTextOptions() {
        return this.delimitedTextOptions;
    }

    /**
     * <p>
     * Options relating to parsing delimited text. Required if dataFormat is DELIMITED_TEXT.
     * </p>
     * 
     * @param delimitedTextOptions
     *        Options relating to parsing delimited text. Required if dataFormat is DELIMITED_TEXT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportOptions withDelimitedTextOptions(DelimitedTextImportOptions delimitedTextOptions) {
        setDelimitedTextOptions(delimitedTextOptions);
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
        if (getDestinationOptions() != null)
            sb.append("DestinationOptions: ").append(getDestinationOptions()).append(",");
        if (getDelimitedTextOptions() != null)
            sb.append("DelimitedTextOptions: ").append(getDelimitedTextOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportOptions == false)
            return false;
        ImportOptions other = (ImportOptions) obj;
        if (other.getDestinationOptions() == null ^ this.getDestinationOptions() == null)
            return false;
        if (other.getDestinationOptions() != null && other.getDestinationOptions().equals(this.getDestinationOptions()) == false)
            return false;
        if (other.getDelimitedTextOptions() == null ^ this.getDelimitedTextOptions() == null)
            return false;
        if (other.getDelimitedTextOptions() != null && other.getDelimitedTextOptions().equals(this.getDelimitedTextOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationOptions() == null) ? 0 : getDestinationOptions().hashCode());
        hashCode = prime * hashCode + ((getDelimitedTextOptions() == null) ? 0 : getDelimitedTextOptions().hashCode());
        return hashCode;
    }

    @Override
    public ImportOptions clone() {
        try {
            return (ImportOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.honeycode.model.transform.ImportOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
