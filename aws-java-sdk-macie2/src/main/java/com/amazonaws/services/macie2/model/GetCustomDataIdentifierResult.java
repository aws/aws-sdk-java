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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetCustomDataIdentifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCustomDataIdentifierResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon Macie
     * doesn't delete it permanently. Instead, it soft deletes the identifier.
     * </p>
     */
    private Boolean deleted;
    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched
     * by the regular expression is the same as any string in this array, Amazon Macie ignores it. Ignore words are case
     * sensitive.
     * </p>
     */
    private java.util.List<String> ignoreWords;
    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which must be within proximity
     * (maximumMatchDistance) of the regular expression to match. Keywords aren't case sensitive.
     * </p>
     */
    private java.util.List<String> keywords;
    /**
     * <p>
     * The maximum number of characters that can exist between text that matches the regex pattern and the character
     * sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern.
     * </p>
     */
    private Integer maximumMatchDistance;
    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The regular expression (<i>regex</i>) that defines the pattern to match.
     * </p>
     */
    private String regex;
    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the custom data
     * identifier.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the custom data identifier.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom data identifier.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom data identifier.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the custom data identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and extended ISO 8601 format, when the custom data identifier was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon Macie
     * doesn't delete it permanently. Instead, it soft deletes the identifier.
     * </p>
     * 
     * @param deleted
     *        Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon
     *        Macie doesn't delete it permanently. Instead, it soft deletes the identifier.
     */

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon Macie
     * doesn't delete it permanently. Instead, it soft deletes the identifier.
     * </p>
     * 
     * @return Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon
     *         Macie doesn't delete it permanently. Instead, it soft deletes the identifier.
     */

    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon Macie
     * doesn't delete it permanently. Instead, it soft deletes the identifier.
     * </p>
     * 
     * @param deleted
     *        Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon
     *        Macie doesn't delete it permanently. Instead, it soft deletes the identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult withDeleted(Boolean deleted) {
        setDeleted(deleted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon Macie
     * doesn't delete it permanently. Instead, it soft deletes the identifier.
     * </p>
     * 
     * @return Specifies whether the custom data identifier was deleted. If you delete a custom data identifier, Amazon
     *         Macie doesn't delete it permanently. Instead, it soft deletes the identifier.
     */

    public Boolean isDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     * 
     * @param description
     *        The custom description of the custom data identifier.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     * 
     * @return The custom description of the custom data identifier.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The custom description of the custom data identifier.
     * </p>
     * 
     * @param description
     *        The custom description of the custom data identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     * 
     * @param id
     *        The unique identifier for the custom data identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     * 
     * @return The unique identifier for the custom data identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the custom data identifier.
     * </p>
     * 
     * @param id
     *        The unique identifier for the custom data identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched
     * by the regular expression is the same as any string in this array, Amazon Macie ignores it. Ignore words are case
     * sensitive.
     * </p>
     * 
     * @return An array that lists specific character sequences (ignore words) to exclude from the results. If the text
     *         matched by the regular expression is the same as any string in this array, Amazon Macie ignores it.
     *         Ignore words are case sensitive.
     */

    public java.util.List<String> getIgnoreWords() {
        return ignoreWords;
    }

    /**
     * <p>
     * An array that lists specific character sequences (ignore words) to exclude from the results. If the text matched
     * by the regular expression is the same as any string in this array, Amazon Macie ignores it. Ignore words are case
     * sensitive.
     * </p>
     * 
     * @param ignoreWords
     *        An array that lists specific character sequences (ignore words) to exclude from the results. If the text
     *        matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. Ignore
     *        words are case sensitive.
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
     * by the regular expression is the same as any string in this array, Amazon Macie ignores it. Ignore words are case
     * sensitive.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIgnoreWords(java.util.Collection)} or {@link #withIgnoreWords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ignoreWords
     *        An array that lists specific character sequences (ignore words) to exclude from the results. If the text
     *        matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. Ignore
     *        words are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult withIgnoreWords(String... ignoreWords) {
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
     * by the regular expression is the same as any string in this array, Amazon Macie ignores it. Ignore words are case
     * sensitive.
     * </p>
     * 
     * @param ignoreWords
     *        An array that lists specific character sequences (ignore words) to exclude from the results. If the text
     *        matched by the regular expression is the same as any string in this array, Amazon Macie ignores it. Ignore
     *        words are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult withIgnoreWords(java.util.Collection<String> ignoreWords) {
        setIgnoreWords(ignoreWords);
        return this;
    }

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which must be within proximity
     * (maximumMatchDistance) of the regular expression to match. Keywords aren't case sensitive.
     * </p>
     * 
     * @return An array that lists specific character sequences (keywords), one of which must be within proximity
     *         (maximumMatchDistance) of the regular expression to match. Keywords aren't case sensitive.
     */

    public java.util.List<String> getKeywords() {
        return keywords;
    }

    /**
     * <p>
     * An array that lists specific character sequences (keywords), one of which must be within proximity
     * (maximumMatchDistance) of the regular expression to match. Keywords aren't case sensitive.
     * </p>
     * 
     * @param keywords
     *        An array that lists specific character sequences (keywords), one of which must be within proximity
     *        (maximumMatchDistance) of the regular expression to match. Keywords aren't case sensitive.
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
     * (maximumMatchDistance) of the regular expression to match. Keywords aren't case sensitive.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeywords(java.util.Collection)} or {@link #withKeywords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param keywords
     *        An array that lists specific character sequences (keywords), one of which must be within proximity
     *        (maximumMatchDistance) of the regular expression to match. Keywords aren't case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult withKeywords(String... keywords) {
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
     * (maximumMatchDistance) of the regular expression to match. Keywords aren't case sensitive.
     * </p>
     * 
     * @param keywords
     *        An array that lists specific character sequences (keywords), one of which must be within proximity
     *        (maximumMatchDistance) of the regular expression to match. Keywords aren't case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult withKeywords(java.util.Collection<String> keywords) {
        setKeywords(keywords);
        return this;
    }

    /**
     * <p>
     * The maximum number of characters that can exist between text that matches the regex pattern and the character
     * sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern.
     * </p>
     * 
     * @param maximumMatchDistance
     *        The maximum number of characters that can exist between text that matches the regex pattern and the
     *        character sequences specified by the keywords array. Macie includes or excludes a result based on the
     *        proximity of a keyword to text that matches the regex pattern.
     */

    public void setMaximumMatchDistance(Integer maximumMatchDistance) {
        this.maximumMatchDistance = maximumMatchDistance;
    }

    /**
     * <p>
     * The maximum number of characters that can exist between text that matches the regex pattern and the character
     * sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern.
     * </p>
     * 
     * @return The maximum number of characters that can exist between text that matches the regex pattern and the
     *         character sequences specified by the keywords array. Macie includes or excludes a result based on the
     *         proximity of a keyword to text that matches the regex pattern.
     */

    public Integer getMaximumMatchDistance() {
        return this.maximumMatchDistance;
    }

    /**
     * <p>
     * The maximum number of characters that can exist between text that matches the regex pattern and the character
     * sequences specified by the keywords array. Macie includes or excludes a result based on the proximity of a
     * keyword to text that matches the regex pattern.
     * </p>
     * 
     * @param maximumMatchDistance
     *        The maximum number of characters that can exist between text that matches the regex pattern and the
     *        character sequences specified by the keywords array. Macie includes or excludes a result based on the
     *        proximity of a keyword to text that matches the regex pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult withMaximumMatchDistance(Integer maximumMatchDistance) {
        setMaximumMatchDistance(maximumMatchDistance);
        return this;
    }

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     * 
     * @param name
     *        The custom name of the custom data identifier.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     * 
     * @return The custom name of the custom data identifier.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The custom name of the custom data identifier.
     * </p>
     * 
     * @param name
     *        The custom name of the custom data identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The regular expression (<i>regex</i>) that defines the pattern to match.
     * </p>
     * 
     * @param regex
     *        The regular expression (<i>regex</i>) that defines the pattern to match.
     */

    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * The regular expression (<i>regex</i>) that defines the pattern to match.
     * </p>
     * 
     * @return The regular expression (<i>regex</i>) that defines the pattern to match.
     */

    public String getRegex() {
        return this.regex;
    }

    /**
     * <p>
     * The regular expression (<i>regex</i>) that defines the pattern to match.
     * </p>
     * 
     * @param regex
     *        The regular expression (<i>regex</i>) that defines the pattern to match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult withRegex(String regex) {
        setRegex(regex);
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the custom data
     * identifier.
     * </p>
     * 
     * @return A map of key-value pairs that identifies the tags (keys and values) that are associated with the custom
     *         data identifier.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the custom data
     * identifier.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that identifies the tags (keys and values) that are associated with the custom
     *        data identifier.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of key-value pairs that identifies the tags (keys and values) that are associated with the custom data
     * identifier.
     * </p>
     * 
     * @param tags
     *        A map of key-value pairs that identifies the tags (keys and values) that are associated with the custom
     *        data identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetCustomDataIdentifierResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetCustomDataIdentifierResult addTagsEntry(String key, String value) {
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

    public GetCustomDataIdentifierResult clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeleted() != null)
            sb.append("Deleted: ").append(getDeleted()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof GetCustomDataIdentifierResult == false)
            return false;
        GetCustomDataIdentifierResult other = (GetCustomDataIdentifierResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeleted() == null ^ this.getDeleted() == null)
            return false;
        if (other.getDeleted() != null && other.getDeleted().equals(this.getDeleted()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIgnoreWords() == null) ? 0 : getIgnoreWords().hashCode());
        hashCode = prime * hashCode + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        hashCode = prime * hashCode + ((getMaximumMatchDistance() == null) ? 0 : getMaximumMatchDistance().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetCustomDataIdentifierResult clone() {
        try {
            return (GetCustomDataIdentifierResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
