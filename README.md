## Set up lc-helper

### Fill login cookie

### Change temp file path to
`${your_path}/my-leetcode-practice/src/main/kotlin`

### Change template
```
#set( $initiater = "Solution()" )
package ${your_project_package}.leetcode.editor.en

fun main() {
    val solution = $!velocityTool.camelCaseName(${question.title}).$initiater
}

class $!velocityTool.camelCaseName(${question.title}) {
${question.code}    
}
```