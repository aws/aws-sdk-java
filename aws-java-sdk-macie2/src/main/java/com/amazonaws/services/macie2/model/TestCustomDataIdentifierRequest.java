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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/TestCustomDataIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestCustomDataIdentifierRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The regular expression (regex) that defines the pattern to match. The expression can contain as many as 500
     * characters.
     * </p>
     */
    private String regex;
    /**
     * <p>
     * The sample text to inspect by using the custom data identifier. The text can contain as many as 1,000 characters.
     * </p>
     */
    private String sampleText;

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

    public TestCustomDataIdentifierRequest withIgnoreWords(String... ignoreWords) {
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

    public TestCustomDataIdentifierRequest withIgnoreWords(java.util.Collection<String> ignoreWords) {
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

    public TestCustomDataIdentifierRequest withKeywords(String... keywords) {
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

    public TestCustomDataIdentifierRequest withKeywords(java.util.Collection<String> keywords) {
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

    public TestCustomDataIdentifierRequest withMaximumMatchDistance(Integer maximumMatchDistance) {
        setMaximumMatchDistance(maximumMatchDistance);
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

    public TestCustomDataIdentifierRequest withRegex(String regex) {
        setRegex(regex);
        return this;
    }

    /**
     * <p>
     * The sample text to inspect by using the custom data identifier. The text can contain as many as 1,000 characters.
     * </p>
     * 
     * @param sampleText
     *        The sample text to inspect by using the custom data identifier. The text can contain as many as 1,000
     *        characters.
     */

    public void setSampleText(String sampleText) {
        this.sampleText = sampleText;
    }

    /**
     * <p>
     * The sample text to inspect by using the custom data identifier. The text can contain as many as 1,000 characters.
     * </p>
     * 
     * @return The sample text to inspect by using the custom data identifier. The text can contain as many as 1,000
     *         characters.
     */

    public String getSampleText() {
        return this.sampleText;
    }

    /**
     * <p>
     * The sample text to inspect by using the custom data identifier. The text can contain as many as 1,000 characters.
     * </p>
     * 
     * @param sampleText
     *        The sample text to inspect by using the custom data identifier. The text can contain as many as 1,000
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestCustomDataIdentifierRequest withSampleText(String sampleText) {
        setSampleText(sampleText);
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
        if (getIgnoreWords() != null)
            sb.append("IgnoreWords: ").append(getIgnoreWords()).append(",");
        if (getKeywords() != null)
            sb.append("Keywords: ").append(getKeywords()).append(",");
        if (getMaximumMatchDistance() != null)
            sb.append("MaximumMatchDistance: ").append(getMaximumMatchDistance()).append(",");
        if (getRegex() != null)
            sb.append("Regex: ").append(getRegex()).append(",");
        if (getSampleText() != null)
            sb.append("SampleText: ").append(getSampleText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestCustomDataIdentifierRequest == false)
            return false;
        TestCustomDataIdentifierRequest other = (TestCustomDataIdentifierRequest) obj;
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
        if (other.getRegex() == null ^ this.getRegex() == null)
            return false;
        if (other.getRegex() != null && other.getRegex().equals(this.getRegex()) == false)
            return false;
        if (other.getSampleText() == null ^ this.getSampleText() == null)
            return false;
        if (other.getSampleText() != null && other.getSampleText().equals(this.getSampleText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIgnoreWords() == null) ? 0 : getIgnoreWords().hashCode());
        hashCode = prime * hashCode + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        hashCode = prime * hashCode + ((getMaximumMatchDistance() == null) ? 0 : getMaximumMatchDistance().hashCode());
        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode());
        hashCode = prime * hashCode + ((getSampleText() == null) ? 0 : getSampleText().hashCode());
        return hashCode;
    }

    @Override
    public TestCustomDataIdentifierRequest clone() {
        return (TestCustomDataIdentifierRequest) super.clone();
    }

}
