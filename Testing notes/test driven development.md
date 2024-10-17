# Test Driven Development

Test-driven development reverses traditional development and testing. So, instead of writing your code first and then retroactively fitting a test to validate the piece of code you just wrote, test-driven development dictates that you write the test first and then **implement code changes until your code passes the test you already wrote.**

## Five steps of test-driven development
There are 5 steps in the TDD flow:

1. Read, understand, and process the feature or bug request.
2. Translate the requirement by writing a unit test. If you have [hot reloading][1] set up, the unit test will run and fail as no code is implemented yet.
3. Write and implement the code that fulfills the requirement. Run all tests and they should pass, if not repeat this step.
4. Clean up your code by refactoring.
5. Rinse, lather and repeat. (కడిగి, నురుగు మరియు పునరావృతం చేయండి)

## Red-Green-Refactoring

![alt text](https://www.zealousys.com/wp-content/uploads/2023/09/Steps-to-Implementing-Test-Driven-Development.png)

- The red phase indicates that code does not work.
- The green phase indicates that everything is working, but not necessary in the most optimal way.
- The blue phase indicates that the tester is refactoring the code, but is confident their code is covered with tests which gives the tester confidence to change and improve our code.

In a TDD environment, testers may not be directly writing unit tests but are essential for:

- Collaborating on requirements and acceptance criteria.
- Reviewing and enhancing the testing strategy.
- Writing and automating higher-level tests.
- Ensuring overall quality through various forms of testing.

[1]: https://docs.flutter.dev/tools/hot-reload
[2]: https://nordicapis.com/using-test-driven-development-for-microservices/