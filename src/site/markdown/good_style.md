# Best Practices for Writing Good Comments and Git Commit Messages

## Writing Good Comments

### Issues with Bad Comments/Documentation
- Source code changes but documentation does not.
- Contains wrong or outdated information.
- Comments merely replicate source code.
- Source code should be understandable on its own.
- “Code tells you how; Comments tell you why.”
- Bad code often necessitates more documentation.
- Fix bad code instead of relying on comments.

### Characteristics of Good Comments
- Well-placed comments are extremely helpful.
- Express yourself clearly.
- Primary documentation should be in source code.
- Only use comments when necessary.
- Bad code is a common reason for writing comments.

### Best Practices for Writing Good Comments
1. **Do not duplicate the code.**
2. **Good comments do not excuse unclear code.**
3. **If you can't write a clear comment, the code may have a problem.**
    - “Debugging is twice as hard as writing the code in the first place. Therefore, if you write the code as cleverly as possible, you are, by definition, not smart enough to debug it.”
4. **Comments should dispel confusion, not cause it.**
5. **Explain unidiomatic code in comments.**
6. **Provide links to the original source of copied code.**
    - Enable future readers to understand the full context.
7. **Include links to external references where helpful.**
8. **Add comments when fixing bugs.**
9. **Use comments to mark incomplete implementations.**

## Writing Good Git Commit Messages

### Importance of Good Commit Messages
- Communicate the context of changes.
- Changes are visible with tools like `diff`.
- High-quality comments make tools like `git log` more useful.
- Essential for long-term project maintenance.
- Helps understand why and what changes happened.

### Good Git Conventions
- Follow conventions similar to those for programming languages/tools.
- **Style**: Markup, grammar, capitalization, etc.
- **Content**: What should be included or excluded?
- **Metadata**: How to reference bug numbers, pull requests, etc.

### 7 Rules for Good Git Commit Messages
1. **Separate summary/heading and main text with a line.**
    - Short summary/heading.
    - *Empty row*.
    - Main text.
    - A short message may only have one heading line.
2. **Keep the short summary/heading under 50 characters.**
    - Indicates too many changes if not possible.
3. **Start the short summary/heading with a capital letter.**
4. **Do not end the short summary/heading with a period.**
5. **Use the imperative mood in the summary.**
    - Examples:
        - Merge branch `feature42`
        - Refactor subsystem X for readability
        - Update getting started documentation
        - Remove deprecated methods
        - Release version 1.0.0
    - Good summaries should complete the sentence: "If applied, this commit will..."
6. **Break main text lines after 72 characters.**
7. **Describe what and why in the main text, not how.**
