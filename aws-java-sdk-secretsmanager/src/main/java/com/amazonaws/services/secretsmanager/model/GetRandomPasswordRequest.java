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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/GetRandomPassword" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRandomPasswordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The desired length of the generated password. The default value if you do not include this parameter is 32
     * characters.
     * </p>
     */
    private Long passwordLength;
    /**
     * <p>
     * A string that includes characters that should not be included in the generated password. The default is that all
     * characters from the included sets can be used.
     * </p>
     */
    private String excludeCharacters;
    /**
     * <p>
     * Specifies that the generated password should not include digits. The default if you do not include this switch
     * parameter is that digits can be included.
     * </p>
     */
    private Boolean excludeNumbers;
    /**
     * <p>
     * Specifies that the generated password should not include punctuation characters. The default if you do not
     * include this switch parameter is that punctuation characters can be included.
     * </p>
     * <p>
     * The following are the punctuation characters that <i>can</i> be included in the generated password if you don't
     * explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:
     * </p>
     * <p>
     * <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code>
     * </p>
     */
    private Boolean excludePunctuation;
    /**
     * <p>
     * Specifies that the generated password should not include uppercase letters. The default if you do not include
     * this switch parameter is that uppercase letters can be included.
     * </p>
     */
    private Boolean excludeUppercase;
    /**
     * <p>
     * Specifies that the generated password should not include lowercase letters. The default if you do not include
     * this switch parameter is that lowercase letters can be included.
     * </p>
     */
    private Boolean excludeLowercase;
    /**
     * <p>
     * Specifies that the generated password can include the space character. The default if you do not include this
     * switch parameter is that the space character is not included.
     * </p>
     */
    private Boolean includeSpace;
    /**
     * <p>
     * A boolean value that specifies whether the generated password must include at least one of every allowed
     * character type. The default value is <code>True</code> and the operation requires at least one of every character
     * type.
     * </p>
     */
    private Boolean requireEachIncludedType;

    /**
     * <p>
     * The desired length of the generated password. The default value if you do not include this parameter is 32
     * characters.
     * </p>
     * 
     * @param passwordLength
     *        The desired length of the generated password. The default value if you do not include this parameter is 32
     *        characters.
     */

    public void setPasswordLength(Long passwordLength) {
        this.passwordLength = passwordLength;
    }

    /**
     * <p>
     * The desired length of the generated password. The default value if you do not include this parameter is 32
     * characters.
     * </p>
     * 
     * @return The desired length of the generated password. The default value if you do not include this parameter is
     *         32 characters.
     */

    public Long getPasswordLength() {
        return this.passwordLength;
    }

    /**
     * <p>
     * The desired length of the generated password. The default value if you do not include this parameter is 32
     * characters.
     * </p>
     * 
     * @param passwordLength
     *        The desired length of the generated password. The default value if you do not include this parameter is 32
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRandomPasswordRequest withPasswordLength(Long passwordLength) {
        setPasswordLength(passwordLength);
        return this;
    }

    /**
     * <p>
     * A string that includes characters that should not be included in the generated password. The default is that all
     * characters from the included sets can be used.
     * </p>
     * 
     * @param excludeCharacters
     *        A string that includes characters that should not be included in the generated password. The default is
     *        that all characters from the included sets can be used.
     */

    public void setExcludeCharacters(String excludeCharacters) {
        this.excludeCharacters = excludeCharacters;
    }

    /**
     * <p>
     * A string that includes characters that should not be included in the generated password. The default is that all
     * characters from the included sets can be used.
     * </p>
     * 
     * @return A string that includes characters that should not be included in the generated password. The default is
     *         that all characters from the included sets can be used.
     */

    public String getExcludeCharacters() {
        return this.excludeCharacters;
    }

    /**
     * <p>
     * A string that includes characters that should not be included in the generated password. The default is that all
     * characters from the included sets can be used.
     * </p>
     * 
     * @param excludeCharacters
     *        A string that includes characters that should not be included in the generated password. The default is
     *        that all characters from the included sets can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRandomPasswordRequest withExcludeCharacters(String excludeCharacters) {
        setExcludeCharacters(excludeCharacters);
        return this;
    }

    /**
     * <p>
     * Specifies that the generated password should not include digits. The default if you do not include this switch
     * parameter is that digits can be included.
     * </p>
     * 
     * @param excludeNumbers
     *        Specifies that the generated password should not include digits. The default if you do not include this
     *        switch parameter is that digits can be included.
     */

    public void setExcludeNumbers(Boolean excludeNumbers) {
        this.excludeNumbers = excludeNumbers;
    }

    /**
     * <p>
     * Specifies that the generated password should not include digits. The default if you do not include this switch
     * parameter is that digits can be included.
     * </p>
     * 
     * @return Specifies that the generated password should not include digits. The default if you do not include this
     *         switch parameter is that digits can be included.
     */

    public Boolean getExcludeNumbers() {
        return this.excludeNumbers;
    }

    /**
     * <p>
     * Specifies that the generated password should not include digits. The default if you do not include this switch
     * parameter is that digits can be included.
     * </p>
     * 
     * @param excludeNumbers
     *        Specifies that the generated password should not include digits. The default if you do not include this
     *        switch parameter is that digits can be included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRandomPasswordRequest withExcludeNumbers(Boolean excludeNumbers) {
        setExcludeNumbers(excludeNumbers);
        return this;
    }

    /**
     * <p>
     * Specifies that the generated password should not include digits. The default if you do not include this switch
     * parameter is that digits can be included.
     * </p>
     * 
     * @return Specifies that the generated password should not include digits. The default if you do not include this
     *         switch parameter is that digits can be included.
     */

    public Boolean isExcludeNumbers() {
        return this.excludeNumbers;
    }

    /**
     * <p>
     * Specifies that the generated password should not include punctuation characters. The default if you do not
     * include this switch parameter is that punctuation characters can be included.
     * </p>
     * <p>
     * The following are the punctuation characters that <i>can</i> be included in the generated password if you don't
     * explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:
     * </p>
     * <p>
     * <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code>
     * </p>
     * 
     * @param excludePunctuation
     *        Specifies that the generated password should not include punctuation characters. The default if you do not
     *        include this switch parameter is that punctuation characters can be included.</p>
     *        <p>
     *        The following are the punctuation characters that <i>can</i> be included in the generated password if you
     *        don't explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:
     *        </p>
     *        <p>
     *        <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code>
     */

    public void setExcludePunctuation(Boolean excludePunctuation) {
        this.excludePunctuation = excludePunctuation;
    }

    /**
     * <p>
     * Specifies that the generated password should not include punctuation characters. The default if you do not
     * include this switch parameter is that punctuation characters can be included.
     * </p>
     * <p>
     * The following are the punctuation characters that <i>can</i> be included in the generated password if you don't
     * explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:
     * </p>
     * <p>
     * <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code>
     * </p>
     * 
     * @return Specifies that the generated password should not include punctuation characters. The default if you do
     *         not include this switch parameter is that punctuation characters can be included.</p>
     *         <p>
     *         The following are the punctuation characters that <i>can</i> be included in the generated password if you
     *         don't explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:
     *         </p>
     *         <p>
     *         <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code>
     */

    public Boolean getExcludePunctuation() {
        return this.excludePunctuation;
    }

    /**
     * <p>
     * Specifies that the generated password should not include punctuation characters. The default if you do not
     * include this switch parameter is that punctuation characters can be included.
     * </p>
     * <p>
     * The following are the punctuation characters that <i>can</i> be included in the generated password if you don't
     * explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:
     * </p>
     * <p>
     * <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code>
     * </p>
     * 
     * @param excludePunctuation
     *        Specifies that the generated password should not include punctuation characters. The default if you do not
     *        include this switch parameter is that punctuation characters can be included.</p>
     *        <p>
     *        The following are the punctuation characters that <i>can</i> be included in the generated password if you
     *        don't explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:
     *        </p>
     *        <p>
     *        <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRandomPasswordRequest withExcludePunctuation(Boolean excludePunctuation) {
        setExcludePunctuation(excludePunctuation);
        return this;
    }

    /**
     * <p>
     * Specifies that the generated password should not include punctuation characters. The default if you do not
     * include this switch parameter is that punctuation characters can be included.
     * </p>
     * <p>
     * The following are the punctuation characters that <i>can</i> be included in the generated password if you don't
     * explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:
     * </p>
     * <p>
     * <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code>
     * </p>
     * 
     * @return Specifies that the generated password should not include punctuation characters. The default if you do
     *         not include this switch parameter is that punctuation characters can be included.</p>
     *         <p>
     *         The following are the punctuation characters that <i>can</i> be included in the generated password if you
     *         don't explicitly exclude them with <code>ExcludeCharacters</code> or <code>ExcludePunctuation</code>:
     *         </p>
     *         <p>
     *         <code>! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~</code>
     */

    public Boolean isExcludePunctuation() {
        return this.excludePunctuation;
    }

    /**
     * <p>
     * Specifies that the generated password should not include uppercase letters. The default if you do not include
     * this switch parameter is that uppercase letters can be included.
     * </p>
     * 
     * @param excludeUppercase
     *        Specifies that the generated password should not include uppercase letters. The default if you do not
     *        include this switch parameter is that uppercase letters can be included.
     */

    public void setExcludeUppercase(Boolean excludeUppercase) {
        this.excludeUppercase = excludeUppercase;
    }

    /**
     * <p>
     * Specifies that the generated password should not include uppercase letters. The default if you do not include
     * this switch parameter is that uppercase letters can be included.
     * </p>
     * 
     * @return Specifies that the generated password should not include uppercase letters. The default if you do not
     *         include this switch parameter is that uppercase letters can be included.
     */

    public Boolean getExcludeUppercase() {
        return this.excludeUppercase;
    }

    /**
     * <p>
     * Specifies that the generated password should not include uppercase letters. The default if you do not include
     * this switch parameter is that uppercase letters can be included.
     * </p>
     * 
     * @param excludeUppercase
     *        Specifies that the generated password should not include uppercase letters. The default if you do not
     *        include this switch parameter is that uppercase letters can be included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRandomPasswordRequest withExcludeUppercase(Boolean excludeUppercase) {
        setExcludeUppercase(excludeUppercase);
        return this;
    }

    /**
     * <p>
     * Specifies that the generated password should not include uppercase letters. The default if you do not include
     * this switch parameter is that uppercase letters can be included.
     * </p>
     * 
     * @return Specifies that the generated password should not include uppercase letters. The default if you do not
     *         include this switch parameter is that uppercase letters can be included.
     */

    public Boolean isExcludeUppercase() {
        return this.excludeUppercase;
    }

    /**
     * <p>
     * Specifies that the generated password should not include lowercase letters. The default if you do not include
     * this switch parameter is that lowercase letters can be included.
     * </p>
     * 
     * @param excludeLowercase
     *        Specifies that the generated password should not include lowercase letters. The default if you do not
     *        include this switch parameter is that lowercase letters can be included.
     */

    public void setExcludeLowercase(Boolean excludeLowercase) {
        this.excludeLowercase = excludeLowercase;
    }

    /**
     * <p>
     * Specifies that the generated password should not include lowercase letters. The default if you do not include
     * this switch parameter is that lowercase letters can be included.
     * </p>
     * 
     * @return Specifies that the generated password should not include lowercase letters. The default if you do not
     *         include this switch parameter is that lowercase letters can be included.
     */

    public Boolean getExcludeLowercase() {
        return this.excludeLowercase;
    }

    /**
     * <p>
     * Specifies that the generated password should not include lowercase letters. The default if you do not include
     * this switch parameter is that lowercase letters can be included.
     * </p>
     * 
     * @param excludeLowercase
     *        Specifies that the generated password should not include lowercase letters. The default if you do not
     *        include this switch parameter is that lowercase letters can be included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRandomPasswordRequest withExcludeLowercase(Boolean excludeLowercase) {
        setExcludeLowercase(excludeLowercase);
        return this;
    }

    /**
     * <p>
     * Specifies that the generated password should not include lowercase letters. The default if you do not include
     * this switch parameter is that lowercase letters can be included.
     * </p>
     * 
     * @return Specifies that the generated password should not include lowercase letters. The default if you do not
     *         include this switch parameter is that lowercase letters can be included.
     */

    public Boolean isExcludeLowercase() {
        return this.excludeLowercase;
    }

    /**
     * <p>
     * Specifies that the generated password can include the space character. The default if you do not include this
     * switch parameter is that the space character is not included.
     * </p>
     * 
     * @param includeSpace
     *        Specifies that the generated password can include the space character. The default if you do not include
     *        this switch parameter is that the space character is not included.
     */

    public void setIncludeSpace(Boolean includeSpace) {
        this.includeSpace = includeSpace;
    }

    /**
     * <p>
     * Specifies that the generated password can include the space character. The default if you do not include this
     * switch parameter is that the space character is not included.
     * </p>
     * 
     * @return Specifies that the generated password can include the space character. The default if you do not include
     *         this switch parameter is that the space character is not included.
     */

    public Boolean getIncludeSpace() {
        return this.includeSpace;
    }

    /**
     * <p>
     * Specifies that the generated password can include the space character. The default if you do not include this
     * switch parameter is that the space character is not included.
     * </p>
     * 
     * @param includeSpace
     *        Specifies that the generated password can include the space character. The default if you do not include
     *        this switch parameter is that the space character is not included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRandomPasswordRequest withIncludeSpace(Boolean includeSpace) {
        setIncludeSpace(includeSpace);
        return this;
    }

    /**
     * <p>
     * Specifies that the generated password can include the space character. The default if you do not include this
     * switch parameter is that the space character is not included.
     * </p>
     * 
     * @return Specifies that the generated password can include the space character. The default if you do not include
     *         this switch parameter is that the space character is not included.
     */

    public Boolean isIncludeSpace() {
        return this.includeSpace;
    }

    /**
     * <p>
     * A boolean value that specifies whether the generated password must include at least one of every allowed
     * character type. The default value is <code>True</code> and the operation requires at least one of every character
     * type.
     * </p>
     * 
     * @param requireEachIncludedType
     *        A boolean value that specifies whether the generated password must include at least one of every allowed
     *        character type. The default value is <code>True</code> and the operation requires at least one of every
     *        character type.
     */

    public void setRequireEachIncludedType(Boolean requireEachIncludedType) {
        this.requireEachIncludedType = requireEachIncludedType;
    }

    /**
     * <p>
     * A boolean value that specifies whether the generated password must include at least one of every allowed
     * character type. The default value is <code>True</code> and the operation requires at least one of every character
     * type.
     * </p>
     * 
     * @return A boolean value that specifies whether the generated password must include at least one of every allowed
     *         character type. The default value is <code>True</code> and the operation requires at least one of every
     *         character type.
     */

    public Boolean getRequireEachIncludedType() {
        return this.requireEachIncludedType;
    }

    /**
     * <p>
     * A boolean value that specifies whether the generated password must include at least one of every allowed
     * character type. The default value is <code>True</code> and the operation requires at least one of every character
     * type.
     * </p>
     * 
     * @param requireEachIncludedType
     *        A boolean value that specifies whether the generated password must include at least one of every allowed
     *        character type. The default value is <code>True</code> and the operation requires at least one of every
     *        character type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRandomPasswordRequest withRequireEachIncludedType(Boolean requireEachIncludedType) {
        setRequireEachIncludedType(requireEachIncludedType);
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies whether the generated password must include at least one of every allowed
     * character type. The default value is <code>True</code> and the operation requires at least one of every character
     * type.
     * </p>
     * 
     * @return A boolean value that specifies whether the generated password must include at least one of every allowed
     *         character type. The default value is <code>True</code> and the operation requires at least one of every
     *         character type.
     */

    public Boolean isRequireEachIncludedType() {
        return this.requireEachIncludedType;
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
        if (getPasswordLength() != null)
            sb.append("PasswordLength: ").append(getPasswordLength()).append(",");
        if (getExcludeCharacters() != null)
            sb.append("ExcludeCharacters: ").append(getExcludeCharacters()).append(",");
        if (getExcludeNumbers() != null)
            sb.append("ExcludeNumbers: ").append(getExcludeNumbers()).append(",");
        if (getExcludePunctuation() != null)
            sb.append("ExcludePunctuation: ").append(getExcludePunctuation()).append(",");
        if (getExcludeUppercase() != null)
            sb.append("ExcludeUppercase: ").append(getExcludeUppercase()).append(",");
        if (getExcludeLowercase() != null)
            sb.append("ExcludeLowercase: ").append(getExcludeLowercase()).append(",");
        if (getIncludeSpace() != null)
            sb.append("IncludeSpace: ").append(getIncludeSpace()).append(",");
        if (getRequireEachIncludedType() != null)
            sb.append("RequireEachIncludedType: ").append(getRequireEachIncludedType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRandomPasswordRequest == false)
            return false;
        GetRandomPasswordRequest other = (GetRandomPasswordRequest) obj;
        if (other.getPasswordLength() == null ^ this.getPasswordLength() == null)
            return false;
        if (other.getPasswordLength() != null && other.getPasswordLength().equals(this.getPasswordLength()) == false)
            return false;
        if (other.getExcludeCharacters() == null ^ this.getExcludeCharacters() == null)
            return false;
        if (other.getExcludeCharacters() != null && other.getExcludeCharacters().equals(this.getExcludeCharacters()) == false)
            return false;
        if (other.getExcludeNumbers() == null ^ this.getExcludeNumbers() == null)
            return false;
        if (other.getExcludeNumbers() != null && other.getExcludeNumbers().equals(this.getExcludeNumbers()) == false)
            return false;
        if (other.getExcludePunctuation() == null ^ this.getExcludePunctuation() == null)
            return false;
        if (other.getExcludePunctuation() != null && other.getExcludePunctuation().equals(this.getExcludePunctuation()) == false)
            return false;
        if (other.getExcludeUppercase() == null ^ this.getExcludeUppercase() == null)
            return false;
        if (other.getExcludeUppercase() != null && other.getExcludeUppercase().equals(this.getExcludeUppercase()) == false)
            return false;
        if (other.getExcludeLowercase() == null ^ this.getExcludeLowercase() == null)
            return false;
        if (other.getExcludeLowercase() != null && other.getExcludeLowercase().equals(this.getExcludeLowercase()) == false)
            return false;
        if (other.getIncludeSpace() == null ^ this.getIncludeSpace() == null)
            return false;
        if (other.getIncludeSpace() != null && other.getIncludeSpace().equals(this.getIncludeSpace()) == false)
            return false;
        if (other.getRequireEachIncludedType() == null ^ this.getRequireEachIncludedType() == null)
            return false;
        if (other.getRequireEachIncludedType() != null && other.getRequireEachIncludedType().equals(this.getRequireEachIncludedType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPasswordLength() == null) ? 0 : getPasswordLength().hashCode());
        hashCode = prime * hashCode + ((getExcludeCharacters() == null) ? 0 : getExcludeCharacters().hashCode());
        hashCode = prime * hashCode + ((getExcludeNumbers() == null) ? 0 : getExcludeNumbers().hashCode());
        hashCode = prime * hashCode + ((getExcludePunctuation() == null) ? 0 : getExcludePunctuation().hashCode());
        hashCode = prime * hashCode + ((getExcludeUppercase() == null) ? 0 : getExcludeUppercase().hashCode());
        hashCode = prime * hashCode + ((getExcludeLowercase() == null) ? 0 : getExcludeLowercase().hashCode());
        hashCode = prime * hashCode + ((getIncludeSpace() == null) ? 0 : getIncludeSpace().hashCode());
        hashCode = prime * hashCode + ((getRequireEachIncludedType() == null) ? 0 : getRequireEachIncludedType().hashCode());
        return hashCode;
    }

    @Override
    public GetRandomPasswordRequest clone() {
        return (GetRandomPasswordRequest) super.clone();
    }

}
