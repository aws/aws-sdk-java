/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateCustomDataIdentifier" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomDataIdentifierRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A custom description of the custom data identifier. The description can contain up to 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the description of a custom data identifier.
     * Other users of your account might be able to see the identifier's description, depending on the actions that
     * they're allowed to perform in Amazon Macie.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched
     * by the regular expression is the same as any string in this array, Amazon Macie ignores it. The array can contain
     * as many as 10 ignore words. Each ignore word can contain 4 - 90 characters.
     * </p>
     */
    private java.util.List<String> ignoreWords;
    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which must be within proximity
     * (maximumMatchDistance) of the regular expression to match. The array can contain as many as 50 keywords. Each
     * keyword can contain 4 - 90 characters.
     * </p>
     */
    private java.util.List<String> keywords;
    /**
     * <p>
     * The maximum number of characters that can exist between text that matches the regex pattern and the character
     * sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern. The distance can be 1 - 300 characters. The default value is 300.
     * </p>
     */
    private Integer maximumMatchDistance;
    /**
     * <p>
     * A custom name for the custom data identifier. The name can contain as many as 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the name of a custom data identifier. Other
     * users of your account might be able to see the identifier's name, depending on the actions that they're allowed
     * to perform in Amazon Macie.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 500
     * characters.
     * </p>
     */
    private String regex;
    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the custom data identifier.
     * </p>
     * <p>
     * A custom data identifier can have a maximum of 50 tags. Each tag consists of a required tag key and an associated
     * tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDataIdentifierRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A custom description of the custom data identifier. The description can contain up to 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the description of a custom data identifier.
     * Other users of your account might be able to see the identifier's description, depending on the actions that
     * they're allowed to perform in Amazon Macie.
     * </p>
     * 
     * @param description
     *        A custom description of the custom data identifier. The description can contain up to 120 characters.</p>
     *        <p>
     *        We strongly recommend that you avoid including any sensitive data in the description of a custom data
     *        identifier. Other users of your account might be able to see the identifier's description, depending on
     *        the actions that they're allowed to perform in Amazon Macie.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A custom description of the custom data identifier. The description can contain up to 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the description of a custom data identifier.
     * Other users of your account might be able to see the identifier's description, depending on the actions that
     * they're allowed to perform in Amazon Macie.
     * </p>
     * 
     * @return A custom description of the custom data identifier. The description can contain up to 120 characters.</p>
     *         <p>
     *         We strongly recommend that you avoid including any sensitive data in the description of a custom data
     *         identifier. Other users of your account might be able to see the identifier's description, depending on
     *         the actions that they're allowed to perform in Amazon Macie.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A custom description of the custom data identifier. The description can contain up to 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the description of a custom data identifier.
     * Other users of your account might be able to see the identifier's description, depending on the actions that
     * they're allowed to perform in Amazon Macie.
     * </p>
     * 
     * @param description
     *        A custom description of the custom data identifier. The description can contain up to 120 characters.</p>
     *        <p>
     *        We strongly recommend that you avoid including any sensitive data in the description of a custom data
     *        identifier. Other users of your account might be able to see the identifier's description, depending on
     *        the actions that they're allowed to perform in Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDataIdentifierRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched
     * by the regular expression is the same as any string in this array, Amazon Macie ignores it. The array can contain
     * as many as 10 ignore words. Each ignore word can contain 4 - 90 characters.
     * </p>
     * 
     * @return An array that lists specific character sequences (ignore words) to exclude from the results. If the text
     *         matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. The
     *         array can contain as many as 10 ignore words. Each ignore word can contain 4 - 90 characters.
     */

    public java.util.List<String> getIgnoreWords() {
        return ignoreWords;
    }

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched
     * by the regular expression is the same as any string in this array, Amazon Macie ignores it. The array can contain
     * as many as 10 ignore words. Each ignore word can contain 4 - 90 characters.
     * </p>
     * 
     * @param ignoreWords
     *        An array that lists specific character sequences (ignore words) to exclude from the results. If the text
     *        matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. The
     *        array can contain as many as 10 ignore words. Each ignore word can contain 4 - 90 characters.
     */

    public void setIgnoreWords(java.util.Collection<String> ignoreWords) {
        if (ignoreWords == null) {
            this.ignoreWords = null;
            return;
        }

        this.ignoreWords = new java.util.ArrayList<String>(ignoreWords);
    }

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched
     * by the regular expression is the same as any string in this array, Amazon Macie ignores it. The array can contain
     * as many as 10 ignore words. Each ignore word can contain 4 - 90 characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIgnoreWords(java.util.Collection)} or {@link #withIgnoreWords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ignoreWords
     *        An array that lists specific character sequences (ignore words) to exclude from the results. If the text
     *        matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. The
     *        array can contain as many as 10 ignore words. Each ignore word can contain 4 - 90 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDataIdentifierRequest withIgnoreWords(String... ignoreWords) {
        if (this.ignoreWords == null) {
            setIgnoreWords(new java.util.ArrayList<String>(ignoreWords.length));
        }
        for (String ele : ignoreWords) {
            this.ignoreWords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched
     * by the regular expression is the same as any string in this array, Amazon Macie ignores it. The array can contain
     * as many as 10 ignore words. Each ignore word can contain 4 - 90 characters.
     * </p>
     * 
     * @param ignoreWords
     *        An array that lists specific character sequences (ignore words) to exclude from the results. If the text
     *        matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. The
     *        array can contain as many as 10 ignore words. Each ignore word can contain 4 - 90 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDataIdentifierRequest withIgnoreWords(java.util.Collection<String> ignoreWords) {
        setIgnoreWords(ignoreWords);
        return this;
    }

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which must be within proximity
     * (maximumMatchDistance) of the regular expression to match. The array can contain as many as 50 keywords. Each
     * keyword can contain 4 - 90 characters.
     * </p>
     * 
     * @return An array that lists specific character sequences (keywords), one of which must be within proximity
     *         (maximumMatchDistance) of the regular expression to match. The array can contain as many as 50 keywords.
     *         Each keyword can contain 4 - 90 characters.
     */

    public java.util.List<String> getKeywords() {
        return keywords;
    }

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which must be within proximity
     * (maximumMatchDistance) of the regular expression to match. The array can contain as many as 50 keywords. Each
     * keyword can contain 4 - 90 characters.
     * </p>
     * 
     * @param keywords
     *        An array that lists specific character sequences (keywords), one of which must be within proximity
     *        (maximumMatchDistance) of the regular expression to match. The array can contain as many as 50 keywords.
     *        Each keyword can contain 4 - 90 characters.
     */

    public void setKeywords(java.util.Collection<String> keywords) {
        if (keywords == null) {
            this.keywords = null;
            return;
        }

        this.keywords = new java.util.ArrayList<String>(keywords);
    }

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which must be within proximity
     * (maximumMatchDistance) of the regular expression to match. The array can contain as many as 50 keywords. Each
     * keyword can contain 4 - 90 characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeywords(java.util.Collection)} or {@link #withKeywords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param keywords
     *        An array that lists specific character sequences (keywords), one of which must be within proximity
     *        (maximumMatchDistance) of the regular expression to match. The array can contain as many as 50 keywords.
     *        Each keyword can contain 4 - 90 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDataIdentifierRequest withKeywords(String... keywords) {
        if (this.keywords == null) {
            setKeywords(new java.util.ArrayList<String>(keywords.length));
        }
        for (String ele : keywords) {
            this.keywords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which must be within proximity
     * (maximumMatchDistance) of the regular expression to match. The array can contain as many as 50 keywords. Each
     * keyword can contain 4 - 90 characters.
     * </p>
     * 
     * @param keywords
     *        An array that lists specific character sequences (keywords), one of which must be within proximity
     *        (maximumMatchDistance) of the regular expression to match. The array can contain as many as 50 keywords.
     *        Each keyword can contain 4 - 90 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDataIdentifierRequest withKeywords(java.util.Collection<String> keywords) {
        setKeywords(keywords);
        return this;
    }

    /**
     * <p>
     * The maximum number of characters that can exist between text that matches the regex pattern and the character
     * sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern. The distance can be 1 - 300 characters. The default value is 300.
     * </p>
     * 
     * @param maximumMatchDistance
     *        The maximum number of characters that can exist between text that matches the regex pattern and the
     *        character sequences specified by the keywords array. Macie includes or excludes a result based on the
     *        proximity of a keyword to text that matches the regex pattern. The distance can be 1 - 300 characters. The
     *        default value is 300.
     */

    public void setMaximumMatchDistance(Integer maximumMatchDistance) {
        this.maximumMatchDistance = maximumMatchDistance;
    }

    /**
     * <p>
     * The maximum number of characters that can exist between text that matches the regex pattern and the character
     * sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern. The distance can be 1 - 300 characters. The default value is 300.
     * </p>
     * 
     * @return The maximum number of characters that can exist between text that matches the regex pattern and the
     *         character sequences specified by the keywords array. Macie includes or excludes a result based on the
     *         proximity of a keyword to text that matches the regex pattern. The distance can be 1 - 300 characters.
     *         The default value is 300.
     */

    public Integer getMaximumMatchDistance() {
        return this.maximumMatchDistance;
    }

    /**
     * <p>
     * The maximum number of characters that can exist between text that matches the regex pattern and the character
     * sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern. The distance can be 1 - 300 characters. The default value is 300.
     * </p>
     * 
     * @param maximumMatchDistance
     *        The maximum number of characters that can exist between text that matches the regex pattern and the
     *        character sequences specified by the keywords array. Macie includes or excludes a result based on the
     *        proximity of a keyword to text that matches the regex pattern. The distance can be 1 - 300 characters. The
     *        default value is 300.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDataIdentifierRequest withMaximumMatchDistance(Integer maximumMatchDistance) {
        setMaximumMatchDistance(maximumMatchDistance);
        return this;
    }

    /**
     * <p>
     * A custom name for the custom data identifier. The name can contain as many as 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the name of a custom data identifier. Other
     * users of your account might be able to see the identifier's name, depending on the actions that they're allowed
     * to perform in Amazon Macie.
     * </p>
     * 
     * @param name
     *        A custom name for the custom data identifier. The name can contain as many as 120 characters.</p>
     *        <p>
     *        We strongly recommend that you avoid including any sensitive data in the name of a custom data identifier.
     *        Other users of your account might be able to see the identifier's name, depending on the actions that
     *        they're allowed to perform in Amazon Macie.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A custom name for the custom data identifier. The name can contain as many as 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the name of a custom data identifier. Other
     * users of your account might be able to see the identifier's name, depending on the actions that they're allowed
     * to perform in Amazon Macie.
     * </p>
     * 
     * @return A custom name for the custom data identifier. The name can contain as many as 120 characters.</p>
     *         <p>
     *         We strongly recommend that you avoid including any sensitive data in the name of a custom data
     *         identifier. Other users of your account might be able to see the identifier's name, depending on the
     *         actions that they're allowed to perform in Amazon Macie.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A custom name for the custom data identifier. The name can contain as many as 120 characters.
     * </p>
     * <p>
     * We strongly recommend that you avoid including any sensitive data in the name of a custom data identifier. Other
     * users of your account might be able to see the identifier's name, depending on the actions that they're allowed
     * to perform in Amazon Macie.
     * </p>
     * 
     * @param name
     *        A custom name for the custom data identifier. The name can contain as many as 120 characters.</p>
     *        <p>
     *        We strongly recommend that you avoid including any sensitive data in the name of a custom data identifier.
     *        Other users of your account might be able to see the identifier's name, depending on the actions that
     *        they're allowed to perform in Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDataIdentifierRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 500
     * characters.
     * </p>
     * 
     * @param regex
     *        The regular expression (regex) that defines the pattern to match. The expression can contain as many as
     *        500 characters.
     */

    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 500
     * characters.
     * </p>
     * 
     * @return The regular expression (regex) that defines the pattern to match. The expression can contain as many as
     *         500 characters.
     */

    public String getRegex() {
        return this.regex;
    }

    /**
     * <p>
     * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 500
     * characters.
     * </p>
     * 
     * @param regex
     *        The regular expression (regex) that defines the pattern to match. The expression can contain as many as
     *        500 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDataIdentifierRequest withRegex(String regex) {
        setRegex(regex);
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the custom data identifier.
     * </p>
     * <p>
     * A custom data identifier can have a maximum of 50 tags. Each tag consists of a required tag key and an associated
     * tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     * 
     * @return A map of key-value pairs that specifies the tags to associate with the custom data identifier.</p>
     *         <p>
     *         A custom data identifier can have a maximum of 50 tags. Each tag consists of a required tag key and an
     *         associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag
     *         value is 256 characters.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the custom data identifier.
     * </p>
     * <p>
     * A custom data identifier can have a maximum of 50 tags. Each tag consists of a required tag key and an associated
     * tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that specifies the tags to associate with the custom data identifier.</p>
     *        <p>
     *        A custom data identifier can have a maximum of 50 tags. Each tag consists of a required tag key and an
     *        associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value
     *        is 256 characters.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that specifies the tags to associate with the custom data identifier.
     * </p>
     * <p>
     * A custom data identifier can have a maximum of 50 tags. Each tag consists of a required tag key and an associated
     * tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256
     * characters.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that specifies the tags to associate with the custom data identifier.</p>
     *        <p>
     *        A custom data identifier can have a maximum of 50 tags. Each tag consists of a required tag key and an
     *        associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value
     *        is 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDataIdentifierRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateCustomDataIdentifierRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDataIdentifierRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomDataIdentifierRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIgnoreWords() != null)
            sb.append("IgnoreWords: ").append(getIgnoreWords()).append(",");
        if (getKeywords() != null)
            sb.append("Keywords: ").append(getKeywords()).append(",");
        if (getMaximumMatchDistance() != null)
            sb.append("MaximumMatchDistance: ").append(getMaximumMatchDistance()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRegex() != null)
            sb.append("Regex: ").append(getRegex()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCustomDataIdentifierRequest == false)
            return false;
        CreateCustomDataIdentifierRequest other = (CreateCustomDataIdentifierRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIgnoreWords() == null ^ this.getIgnoreWords() == null)
            return false;
        if (other.getIgnoreWords() != null && other.getIgnoreWords().equals(this.getIgnoreWords()) == false)
            return false;
        if (other.getKeywords() == null ^ this.getKeywords() == null)
            return false;
        if (other.getKeywords() != null && other.getKeywords().equals(this.getKeywords()) == false)
            return false;
        if (other.getMaximumMatchDistance() == null ^ this.getMaximumMatchDistance() == null)
            return false;
        if (other.getMaximumMatchDistance() != null && other.getMaximumMatchDistance().equals(this.getMaximumMatchDistance()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegex() == null ^ this.getRegex() == null)
            return false;
        if (other.getRegex() != null && other.getRegex().equals(this.getRegex()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIgnoreWords() == null) ? 0 : getIgnoreWords().hashCode());
        hashCode = prime * hashCode + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        hashCode = prime * hashCode + ((getMaximumMatchDistance() == null) ? 0 : getMaximumMatchDistance().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomDataIdentifierRequest clone() {
        return (CreateCustomDataIdentifierRequest) super.clone();
    }

}
