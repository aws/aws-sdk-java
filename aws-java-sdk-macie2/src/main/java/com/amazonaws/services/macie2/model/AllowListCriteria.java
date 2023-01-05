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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the criteria for an allow list. The criteria must specify a regular expression (regex) or an S3 object
 * (s3WordsList). It can't specify both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/AllowListCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllowListCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The regular expression (<i>regex</i>) that defines the text pattern to ignore. The expression can contain as many
     * as 512 characters.
     * </p>
     */
    private String regex;
    /**
     * <p>
     * The location and name of the S3 object that lists specific text to ignore.
     * </p>
     */
    private S3WordsList s3WordsList;

    /**
     * <p>
     * The regular expression (<i>regex</i>) that defines the text pattern to ignore. The expression can contain as many
     * as 512 characters.
     * </p>
     * 
     * @param regex
     *        The regular expression (<i>regex</i>) that defines the text pattern to ignore. The expression can contain
     *        as many as 512 characters.
     */

    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * The regular expression (<i>regex</i>) that defines the text pattern to ignore. The expression can contain as many
     * as 512 characters.
     * </p>
     * 
     * @return The regular expression (<i>regex</i>) that defines the text pattern to ignore. The expression can contain
     *         as many as 512 characters.
     */

    public String getRegex() {
        return this.regex;
    }

    /**
     * <p>
     * The regular expression (<i>regex</i>) that defines the text pattern to ignore. The expression can contain as many
     * as 512 characters.
     * </p>
     * 
     * @param regex
     *        The regular expression (<i>regex</i>) that defines the text pattern to ignore. The expression can contain
     *        as many as 512 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowListCriteria withRegex(String regex) {
        setRegex(regex);
        return this;
    }

    /**
     * <p>
     * The location and name of the S3 object that lists specific text to ignore.
     * </p>
     * 
     * @param s3WordsList
     *        The location and name of the S3 object that lists specific text to ignore.
     */

    public void setS3WordsList(S3WordsList s3WordsList) {
        this.s3WordsList = s3WordsList;
    }

    /**
     * <p>
     * The location and name of the S3 object that lists specific text to ignore.
     * </p>
     * 
     * @return The location and name of the S3 object that lists specific text to ignore.
     */

    public S3WordsList getS3WordsList() {
        return this.s3WordsList;
    }

    /**
     * <p>
     * The location and name of the S3 object that lists specific text to ignore.
     * </p>
     * 
     * @param s3WordsList
     *        The location and name of the S3 object that lists specific text to ignore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowListCriteria withS3WordsList(S3WordsList s3WordsList) {
        setS3WordsList(s3WordsList);
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
        if (getRegex() != null)
            sb.append("Regex: ").append(getRegex()).append(",");
        if (getS3WordsList() != null)
            sb.append("S3WordsList: ").append(getS3WordsList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllowListCriteria == false)
            return false;
        AllowListCriteria other = (AllowListCriteria) obj;
        if (other.getRegex() == null ^ this.getRegex() == null)
            return false;
        if (other.getRegex() != null && other.getRegex().equals(this.getRegex()) == false)
            return false;
        if (other.getS3WordsList() == null ^ this.getS3WordsList() == null)
            return false;
        if (other.getS3WordsList() != null && other.getS3WordsList().equals(this.getS3WordsList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode());
        hashCode = prime * hashCode + ((getS3WordsList() == null) ? 0 : getS3WordsList().hashCode());
        return hashCode;
    }

    @Override
    public AllowListCriteria clone() {
        try {
            return (AllowListCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.AllowListCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
