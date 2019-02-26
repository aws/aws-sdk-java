/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * A request-centric Expression Specification Builder package that can be used to construct valid
 * expressions, and the respective name maps and value maps, for various DynamoDB requests in a typeful manner.
 * <p>
 * {@link com.amazonaws.services.dynamodbv2.xspec.ExpressionSpecBuilder}
 * is the API entry point to this library.
 * <h3>Sample Usage 1: Conditional Updates with Expressions</h3>
 * 
 * <pre class="brush: java">
 * import static com.amazonaws.services.dynamodbv2.xspec.ExpressionSpecBuilder.*;
 * ...
 * Table table = dynamo.getTable(TABLE_NAME);
 * 
 * UpdateItemExpressionSpec xspec = new ExpressionSpecBuilder()
 *      // SET num1 = num1 + 20
 *      .addUpdate(
 *          N("num1").set(N("num1").plus(20)))
 *      // SET string-attr = "string-value"
 *      .addUpdate(
 *          S("string-attr").set("string-value")
 *      )
 *      // num2 BETWEEN 0 AND 100
 *      .withCondition(
 *          N("num2").between(0, 100)
 *      ).buildForUpdate();
 * 
 * table.updateItem(HASH_KEY_NAME, "hashKeyValue", RANGE_KEY_NAME, 0, xspec);
 * </pre>
 * 
 * <h3>Sample Usage 2: Conditional Updates with complex Condition Expression</h3>
 * <p>
 * Let's say you want to include a complex condition expression such as:
 * 
 * <pre>
 *   (attribute_not_exists(item_version) AND attribute_not_exists(config_id) AND attribute_not_exists(config_version)) OR
 *   (item_version < 123) OR
 *   (item_version = 123 AND config_id < 456) OR
 *   (item_version = 123 AND config_id = 456 AND config_version < 999)
 * </pre>
 * 
 * Here is how:
 * <p>
 * 
 * <pre class="brush: java">
 * import static com.amazonaws.services.dynamodbv2.xspec.ExpressionSpecBuilder.*;
 * ...
 * Table table = dynamo.getTable(TABLE_NAME);
 * 
 * UpdateItemExpressionSpec xspec = new ExpressionSpecBuilder()
 *      // SET num1 = num1 + 20
 *      .addUpdate(
 *          N("num1").set(N("num1").plus(20)))
 *      // SET string-attr = "string-value"
 *      .addUpdate(
 *          S("string-attr").set("string-value")
 *      )
 *      // a complex condition expression (as shown above)
 *      .withCondition(
 *          // add explicit parenthesis
 *          parenthesize( attribute_not_exists("item_version")
 *              .and( attribute_not_exists("config_id") )
 *              .and( attribute_not_exists("config_version") )
 *          ).or( N("item_version").lt(123) )
 *           .or( N("item_version").eq(123)
 *              .and( N("config_id").lt(456) ) )
 *           .or( N("item_version").eq(123)
 *              .and( N("config_id").eq(456) )
 *              .and( N("config_version").lt(999) ))
 *      ).buildForUpdate();
 * 
 * table.updateItem(HASH_KEY_NAME, "hashKeyValue", RANGE_KEY_NAME, 0, xspec);
 * </pre>
 * 
 * <h3>Sample Usage 3: Scan with Filter Expression</h3>
 * <p>
 * Without ExpressionSpecBuilder, the code (using the DynamoDB Document API) could
 * be something like:
 * 
 * <pre class="brush: java">
 * ItemCollection&lt;?&gt; col = table.scan(
 *         &quot;(#hk = :hashkeyAttrValue) AND (#rk BETWEEN :lo AND :hi)&quot;,
 *         new NameMap().with(&quot;#hk&quot;, HASH_KEY_NAME).with(&quot;#rk&quot;, RANGE_KEY_NAME),
 *         new ValueMap().withString(&quot;:hashkeyAttrValue&quot;, &quot;allDataTypes&quot;)
 *                 .withInt(&quot;:lo&quot;, 1).withInt(&quot;:hi&quot;, 10));
 * </pre>
 * In contrast, using ExpressionSpecBuilder:
 *<p> 
 * <pre class="brush: java">
 * import static com.amazonaws.services.dynamodbv2.xspec.ExpressionSpecBuilder.*;
 * ...
 * ScanExpressionSpec xspec = new ExpressionSpecBuilder()
 *     .withCondition(
 *         S(HASH_KEY_NAME).eq("allDataTypes")
 *             .and(N(RANGE_KEY_NAME).between(1, 10))
 * ).buildForScan();
 * 
 * ItemCollection<?> col = table.scan(xspec);
 * </pre>
 * 
 * <h3>Sample Usage 4: Updates with SET, ADD, DELETE and REMOVE</h3>
 * 
 * <pre class="brush: java">
 * import static com.amazonaws.services.dynamodbv2.xspec.ExpressionSpecBuilder.*;
 * ...
 * Table table = dynamo.getTable(TABLE_NAME);
 * 
 * UpdateItemExpressionSpec xspec = new ExpressionSpecBuilder()
 *     .addUpdate(S("mapAttr.colors[0]").set("red"))
 *     .addUpdate(S("mapAttr.colors[1]").set("blue"))
 *     .addUpdate(L("mapAttr.members").set(
 *         L("mapAttr.members").listAppend("marry", "liza")))
 *     .addUpdate(SS("mapAttr.countries").append("cn", "uk"))
 *     .addUpdate(SS("mapAttr.brands").delete("Facebook", "LinkedIn"))
 *     .addUpdate(attribute("mapAttr.foo").remove())
 *     .buildForUpdate();
 *
 * assertEquals("SET #0.#1[0] = :0, #0.#1[1] = :1, #0.#2 = list_append(#0.#2, :2) ADD #0.#3 :3 DELETE #0.#4 :4 REMOVE #0.#5",
 *     xspec.getUpdateExpression());
 *     
 * final String hashkey = "addRemoveDeleteColors";
 * table.updateItem(HASH_KEY_NAME, hashkey, RANGE_KEY_NAME, 0, xspec);
 * </pre>
 * 
 * <h4>Notes on Design, Scope and Purposes</h4>
 * <ol>
 * <li>
 * The purpose of this library is to provide an easy-to-use Expression Builder
 * API that can be used to construct valid expressions (for use in a DynamoDB
 * request) in a typeful manner. The intent is to leverage on the type
 * system/compiler to ensure that all the expressions produced by the builder
 * are well-formed and syntactically valid. (In contrast, directly specifying
 * raw strings for the expressions can provide no such guarantee.)</li>
 *
 * <li>This
 * builder library can be used independently to construct valid expressions (as
 * strings) and the associated name-maps and value-maps. These expressions and
 * maps can then be used to make requests to DynamoDB via the DynamoDB
 * Document API. In other words, the expression builder
 * library should be as independent as possible (ie with as little or no
 * dependency on other libraries as possible.)</li>
 * 
 * <li>A dot (".") character in
 * a user specified document path, such as "Product.Reviews", is always assumed
 * by the builder in this proposed library to mean the dereference of a DynamoDB
 * Map element. See more info at <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.html"
 * >Reading and Writing Items Using Expressions</a>. The idea is to handle the
 * majority of cases when the dot (".") character, and sequence (of regex
 * pattern) "\[0-9]+\]" are not literally part of an attribute name.</li> 
 * 
 * <li>An
 * integer enclosed in square bracket in a user specified document path, such as
 * "[2]", is always assumed by the builder in this proposed library to mean the
 * dereference of a DynamoDB List element. The idea is to handle the majority of
 * cases when character sequence such as "[0]" are not literally part of an
 * attribute name.</li> 
 * 
 * <li>To avoid attribute names that may conflict with the
 * DynamoDB reserved words, this library will automatically transform every
 * component of a document path into the use of an "expression attribute name"
 * (that begins with "#") as a placeholder. The actual mapping from the
 * "expression attribute name" to the actual attribute name is automatically
 * taken care of by the builder in a "name map". Similarly, the actual mapping
 * from the "expression attribute value" (that begins with ":") to the actual
 * attribute value is automatically taken care of by the builder in a
 * "value map". See more information at <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ExpressionPlaceholders.html"
 * >Using Placeholders for Attribute Names and Values</a>.</li>
 * </ol>
 */
package com.amazonaws.services.dynamodbv2.xspec;
    
