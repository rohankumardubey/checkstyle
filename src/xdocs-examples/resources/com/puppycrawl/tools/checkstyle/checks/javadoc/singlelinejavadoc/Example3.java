/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="SingleLineJavadoc">
      <property name="ignoreInlineTags" value="false"/>
    </module>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.checks.javadoc.singlelinejavadoc;

// xdoc section -- start
public class Example3 {
  /** @see Math */ // violation, 'Javadoc comment should be multi-line'
  public int foo() {
    return 42;
  }

  /**
   * @return 42
   */
  public int bar() {
    return 42;
  }
  // violation below, 'Javadoc comment should be multi-line'
  /** {@link #equals(Object)} */
  public int baz() {
    return 42;
  }

  /**
   * <p>the answer to the ultimate question
   */
  public int magic() {
    return 42;
  }

  /**
   * <p>the answer to the ultimate question</p>
   */
  public int foobar() {
    return 42;
  }
}
// xdoc section -- end
