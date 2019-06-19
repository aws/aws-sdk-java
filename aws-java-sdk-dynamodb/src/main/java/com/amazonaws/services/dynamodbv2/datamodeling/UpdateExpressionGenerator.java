/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.Adler32;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * This class will contain logic for converting an update object that customer has passed-in into
 * low level update expression and corresponding expression attribute maps.
 * Currently this entails generating a string that can be used as a substitution token in the
 * updateExpression and insert corresponding attribute name/value in the expressionAttributeNameMap/expressionAttributeValueMap
 *
 * For ex: Attribute <stringAttribute="sdkAttributeStringValue"> will be converted to:
 *  updateExpression = "SET #5d810=:5d810" and
 *  expressionAttributeNameMap = {{#5d810, "stringAttribute"},...}
 *  expressionAttributeValueMap = {{:5d810, {S: "sdkAttributeStringValue"}},...}
 *
 * Null valued attributes will be converted to REMOVE expressions similarly and appended to the updateExpression
 *
 * We use deterministic token generation logic to ensure request contents remain same across retried transactionWrite calls.
 * This will help in ensuring idempotency across retried calls.
 * Read more on idempotency of transactionWrite API here:
 *  https://docs.aws.amazon.com/en_us/amazondynamodb/latest/APIReference/API_TransactWriteItems.html#DDB-TransactWriteItems-request-ClientRequestToken
 */
@SdkInternalApi
public class UpdateExpressionGenerator {

    /**
     * Generate a string that can be used as a substitution token for attributeNames and attributeValues in
     * update expression. De-dupes generated string on existingAttributesKeyList.
     * The string starts with a baseToken's substring that is passed in from the caller and then appended with a hex string
     * the hex string represents the locally incremented counter across attributes.
     * In case there is a conflict with above generated string, we'll instead substitute with the full baseToken
     * instead of the baseToken substring
     *
     * For ex:
     *      For a baseToken: 5d81, suffixCounter: 9
     *      the *next* generated string will be 5d81a, 5d81 from baseToken and `a` from the incremented hex counter 9 -> a
     */
    private String generateSubstitutionTokenString(String baseToken,
                                                   Long suffixCounter,
                                                   Set<String> expressionAttributeNamesKeys,
                                                   Set<String> expressionAttributeValuesKeys) {
        String hexSuffix = Long.toHexString(suffixCounter);
        String tokenBase = baseToken.substring(0, Math.min(baseToken.length(), 4)) + hexSuffix;
        if (!expressionAttributeNamesKeys.contains(getExpressionAttributeNameSubstitutionToken(tokenBase)) &&
                    !expressionAttributeValuesKeys.contains(getExpressionAttributeValueSubstitutionToken(tokenBase))) {
            return tokenBase;
        }
        // Fallback to fullToken in case of conflict
        String fullToken = baseToken + hexSuffix;
        if (!expressionAttributeNamesKeys.contains(getExpressionAttributeNameSubstitutionToken(fullToken)) &&
                    !expressionAttributeValuesKeys.contains(getExpressionAttributeValueSubstitutionToken(fullToken))) {
            return fullToken;
        } else {
            throw new DynamoDBMappingException("Failed to process update operation inside transactionWrite request due to conflict with expressionAttributeName or expressionAttributeValue token name: "
                                                       + fullToken + ". Please replace this token name with a different token name.");
        }
    }

    private String generateSubstitutionTokenString(String baseToken,
                                                   Long suffixCounter,
                                                   Set<String> expressionAttributeNamesKeys) {
        return generateSubstitutionTokenString(baseToken,
                                               suffixCounter,
                                               expressionAttributeNamesKeys,
                                               Collections.<String>emptySet());
    }

    /**
     * Merge nonKeyAttributes along with any condition expression attributes and generate corresponding update expression
     */
    public String generateUpdateExpressionAndUpdateAttributeMaps(Map<String, String> expressionAttributeNamesMap,
                                                                 Map<String, AttributeValue> expressionsAttributeValuesMap,
                                                                 Map<String, AttributeValue> nonKeyNonNullAttributeValueMap,
                                                                 List<String> nullValuedNonKeyAttributeNames) {
        StringBuilder updateExpressionSetBuilder = new StringBuilder();
        StringBuilder updateExpressionDeleteBuilder = new StringBuilder();

        // This has to be a sorted list to ensure deterministic retrieval order for nonKeyNonNullAttributes
        // while auto generating update expression tokens
        List<String> sortedNonKeyNonNullAttributeNames = new ArrayList<String>(nonKeyNonNullAttributeValueMap.keySet());
        Collections.sort(sortedNonKeyNonNullAttributeNames);

        // Sort the null valued non-key attributes to ensure deterministic retrieval order for nullValuedNonKeyAttributes
        // while auto generating update expression tokens
        List<String> sortedNullValuedNonKeyAttributeNames = new ArrayList<String>(nullValuedNonKeyAttributeNames);
        Collections.sort(sortedNullValuedNonKeyAttributeNames);


        // Initialize baseToken and suffixCounter for each update item
        String baseToken = getBaseToken(sortedNonKeyNonNullAttributeNames, sortedNullValuedNonKeyAttributeNames);
        Long suffixCounter = 0L;
        if (sortedNonKeyNonNullAttributeNames.size() > 0) {
            updateExpressionSetBuilder.append("SET ");
            List<String> updateStringSetExpressions = new ArrayList<String>();
            for (String nonKeyAttributeName : sortedNonKeyNonNullAttributeNames) {
                String tokenBase = generateSubstitutionTokenString(baseToken,
                                                                   suffixCounter,
                                                                   expressionAttributeNamesMap.keySet(),
                                                                   expressionsAttributeValuesMap.keySet());
                suffixCounter++;
                String tokenKeyName = getExpressionAttributeNameSubstitutionToken(tokenBase);
                String tokenValueName = getExpressionAttributeValueSubstitutionToken(tokenBase);
                expressionAttributeNamesMap.put(tokenKeyName, nonKeyAttributeName);
                expressionsAttributeValuesMap.put(tokenValueName, nonKeyNonNullAttributeValueMap.get(nonKeyAttributeName));
                updateStringSetExpressions.add(tokenKeyName + " = " + tokenValueName);
            }
            for (int i = 0; i < updateStringSetExpressions.size() - 1; i++) {
                updateExpressionSetBuilder.append(updateStringSetExpressions.get(i) + ", ");
            }
            updateExpressionSetBuilder.append(updateStringSetExpressions.get(updateStringSetExpressions.size() - 1));

        }
        if (sortedNullValuedNonKeyAttributeNames.size() > 0) {
            updateExpressionDeleteBuilder.append("REMOVE ");
            List<String> updateStringDeleteExpressions = new ArrayList<String>();
            for (String nullAttributeName : sortedNullValuedNonKeyAttributeNames) {
                String tokenBaseString = generateSubstitutionTokenString(baseToken,
                                                                         suffixCounter,
                                                                         expressionAttributeNamesMap.keySet());
                suffixCounter++;
                String tokenKeyName = getExpressionAttributeNameSubstitutionToken(tokenBaseString);
                expressionAttributeNamesMap.put(tokenKeyName, nullAttributeName);
                updateStringDeleteExpressions.add(tokenKeyName);
            }
            for (int i = 0; i < updateStringDeleteExpressions.size() - 1; i++) {
                updateExpressionDeleteBuilder.append(updateStringDeleteExpressions.get(i) + ", ");
            }
            updateExpressionDeleteBuilder.append(updateStringDeleteExpressions.get(updateStringDeleteExpressions.size() - 1));
        }
        StringBuilder updateExpression = new StringBuilder();
        if (updateExpressionSetBuilder.length() > 0) {
            updateExpression.append(updateExpressionSetBuilder.toString());
        }
        if (updateExpressionDeleteBuilder.length() > 0) {
            updateExpression.append(" " + updateExpressionDeleteBuilder.toString());
        }

        return updateExpression.toString();
    }

    private static String getExpressionAttributeNameSubstitutionToken(String tokenBase) {
        return "#" + tokenBase;
    }

    private static String getExpressionAttributeValueSubstitutionToken(String tokenBase) {
        return ":" + tokenBase;
    }

    /**
     * Uses attribute names from sortedNonKeyNonNullAttributeNames and sortedNullValuedNonKeyAttributeNames to generate an {@link Adler32} checkSum
     * Adler32 generates checksum that is unique enough to be used as a token within an update item and faster to compute than CRC32.
     */
    private String getBaseToken(List<String> sortedNonKeyNonNullAttributeNames,
                                List<String> sortedNullValuedNonKeyAttributeNames) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            for (String nonKeyNonNullAttributeName : sortedNonKeyNonNullAttributeNames) {
                dataOutputStream.writeUTF(nonKeyNonNullAttributeName);
            }
            for (String nullValuedNonKeyAttributeName : sortedNullValuedNonKeyAttributeNames) {
                dataOutputStream.writeUTF(nullValuedNonKeyAttributeName);
            }
        } catch (IOException e) {
            throw new DynamoDBMappingException("Failed to process update operation inside transactionWrite request due to an IOException ", e);
        }
        Adler32 adler32 = new Adler32();
        adler32.update(byteArrayOutputStream.toByteArray());
        return Long.toHexString(adler32.getValue());
    }

}
